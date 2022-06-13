package com.shipment.API.service2;

import com.shipment.API.VO.ResponseAll;
import com.shipment.API.VO.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShipmentController {

    @Autowired
    private ShipmentService service;


    @GetMapping("/shipment")
    public List<Shipment> ShowAll(){
        return service.listAll();
    }


    @PostMapping("/addShipment")
    public String Add(@RequestBody Shipment shipment)
    {
        service.save(shipment);
        return "Added data Successfully";
    }

    @GetMapping("/list/{city}")
    public ResponseTemplateVo getShipmentDetails(@PathVariable("city") String city){
        return service.getShipmentDetails(city);
    }

    @GetMapping("/shipList/{pid}")
    public ResponseAll getDetails(@PathVariable("pid") Integer pid)
    {
        return service.getDetails(pid);
    }


    @GetMapping("shipment/{pid}")
    public Shipment getShipmentByPid(@PathVariable("pid") int pid)
    {
        return service.getShipmentByPid(pid);
    }

}
