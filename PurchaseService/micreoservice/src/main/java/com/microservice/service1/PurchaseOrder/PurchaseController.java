package com.microservice.service1.PurchaseOrder;


import com.microservice.service1.VO.ResponseObject;
import com.microservice.service1.VO.ResponseShipment;
import com.microservice.service1.VO.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService service;

    @GetMapping("/Purchase")
    public List<Purchase> list(){
        return service.listAll();
    }

    @PostMapping("/addOrder")
    public String Add(@RequestBody Purchase purchase){
        service.save(purchase);
        return "Data Added Successfully";
    }


    @GetMapping("/Purchase/{pid}")
    public Purchase findPurchaseByPid(@PathVariable("pid") Integer pid)
    {
        return service.findPurchaseByPid(pid);
    }


    @GetMapping("/listAll/{id}")
    public ResponseTemplateVo getCustomerWithPurchase(@PathVariable("id") Integer id){
        return service.getCustomerWithPurchase(id);
    }

    @GetMapping("/listWithShipment")
    public List<ResponseShipment> getPurchaseWithShipment(){
        return service.getPurchaseWithShipment();
    }

    @GetMapping("/AllObject/{id}")
    public ResponseObject getAllObject(@PathVariable("id") Integer id){
        return service.getAllObject(id);
    }



}
