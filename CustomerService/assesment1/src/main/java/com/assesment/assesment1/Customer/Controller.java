package com.assesment.assesment1.Customer;

import com.assesment.assesment1.VO.ResponseAll;
import com.assesment.assesment1.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CService service;

    @GetMapping("/Customer")
    public List<Customer> list()
    {
        return service.listAll();
    }

    @PostMapping("/addCustomer")
    public String Add (@RequestBody Customer customer)
    {
        service.save(customer);
        return "data added Successfully";

    }


    @GetMapping("/Customer/{id}")
    public Customer findCustomerById(@PathVariable("id") Integer id)
    {
        return service.findCustomerById(id);
    }




    @GetMapping("/listAllPurchases")
    public List<ResponseTemplateVO> getAllCustomerWithPurchases()
    {
        return service.getAllCustomerWithPurchases();
    }


    @GetMapping("/listEveryThing")
    public List<ResponseAll> getEveryone()
    {
        return service.getEveryone();
    }

}
