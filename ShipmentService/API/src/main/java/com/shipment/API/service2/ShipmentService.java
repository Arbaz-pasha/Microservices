package com.shipment.API.service2;


import com.shipment.API.VO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRep rep;

    @Autowired
    public RestTemplate restTemplate;

    public List<Shipment> listAll() {
        System.out.println("its in show fun");
        return rep.findAll();
    }

    public void save(Shipment shipment) {
        System.out.println("its in Add fun");
         rep.save(shipment);
    }


    public ResponseTemplateVo getShipmentDetails(String city)  {
        ResponseTemplateVo vo=new ResponseTemplateVo();

        List<Shipment> listAllShipments= new ArrayList<>();

        for (Shipment s:rep.findAll())
        {

            if ((s.getCity()).equals(city))
            {
                System.out.println("inside the condition");
                listAllShipments.add(s);
            }
            Customer customer=
                    restTemplate.getForObject("http://localhost:8088/Customer/"+ s.id,Customer.class);
            if ((s.getCity()).equals(city) && customer.getId()==s.getId())
            {
                vo.setCustomers(customer);
            }
        }

        vo.setShipmentList(listAllShipments);
        return vo;

    }



    public ResponseAll getDetails(Integer pid) {
        ResponseAll vo= new ResponseAll();
        System.out.println("in getDetails");

        Purchase purchase =
                restTemplate.getForObject("http://localhost:8087/Purchase/"+pid,Purchase.class);

        List<Shipment> shipmentList =new ArrayList<>();

        for (Shipment s:rep.findAll())
        {
            if (s.getPid() == pid)
            {
                System.out.println("after condition");
                shipmentList.add(s);
            }
        }

        vo.setPurchases(purchase);
        vo.setShipmentLists(shipmentList);

        return vo;
    }


    public Shipment getShipmentByPid(int pid) {

        return rep.getShipmentByPid(pid);

    }



}
