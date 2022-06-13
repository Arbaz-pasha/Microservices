package com.microservice.service1.PurchaseOrder;


import com.microservice.service1.VO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseService
{
    @Autowired
    private PurchaseRep repository1;

    @Autowired
    private RestTemplate restTemplate;


    public List<Purchase> listAll() {
        return repository1.findAll();
    }

    public void save(Purchase purchase) {
        System.out.println("its in add func");
        repository1.save(purchase);
    }



    public Purchase findPurchaseByPid(Integer pid) {

        return repository1.findPurchaseByPid(pid);
    }




    public ResponseTemplateVo getCustomerWithPurchase(int id) {
        ResponseTemplateVo vo = new ResponseTemplateVo();

        Customer customer=
                restTemplate.getForObject("http://localhost:8088/Customer/"+id
                        ,Customer.class);


        List<Purchase> purchasesList = new ArrayList<>();

        for(Purchase p : repository1.findAll()){
            if(p.getId() == id){
                purchasesList.add(p);
            }
        }

        vo.setCustomer(customer);
        vo.setPurchases(purchasesList);


        return vo;

    }


    public List<ResponseShipment> getPurchaseWithShipment() {

        List<ResponseShipment> pShipList = new ArrayList<>();

        for (Purchase p:repository1.findAll())
        {
            ResponseShipment responseShipment =
                    restTemplate.getForObject("http://localhost:8086/shipList/"+p.getPid(),ResponseShipment.class);
            pShipList.add(responseShipment);
        }
        return pShipList;
    }


    public ResponseObject getAllObject(Integer id) {

        ResponseObject vo= new ResponseObject();

        Customer customer=
                restTemplate.getForObject("http://localhost:8088/Customer/"+id,Customer.class);

        List<Purchase> purchaseList=new ArrayList<>();

        List<Shipment> shipmentList= new ArrayList<>();
        for (Purchase p:repository1.findAll())
        {
            if (p.getId()==id)
            {
                purchaseList.add(p);
            }
            Shipment shipment=
                    restTemplate.getForObject("http://localhost:8086/shipment/"+p.getPid(),Shipment.class);
            if(shipment.getId()==id)
            {
                shipmentList.add(shipment);
            }

        }
        vo.setCustomer(customer);
        vo.setPurchase(purchaseList);
        vo.setShipmentLists(shipmentList);

        return vo;
    }
}
