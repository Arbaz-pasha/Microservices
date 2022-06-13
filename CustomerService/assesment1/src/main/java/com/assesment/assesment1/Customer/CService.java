package com.assesment.assesment1.Customer;

import com.assesment.assesment1.VO.ResponseAll;
import com.assesment.assesment1.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CService
{
    @Autowired
    private CRepository repository;

    @Autowired
    private RestTemplate restTemplate;


    public List<Customer> listAll()
    {
        return repository.findAll();
    }

    public void save(Customer customer) {
        repository.save(customer);
    }

    public Customer findCustomerById(Integer id) {
        return repository.findCustomerById(id);
    }

    public List<Customer> get(Integer id) {
        return Collections.singletonList(repository.getById(id));
    }






    public List<ResponseTemplateVO> getAllCustomerWithPurchases() {


        List<ResponseTemplateVO> customerList = new ArrayList<>();

        for (Customer c : repository.findAll())
        {
            ResponseTemplateVO customersWithPurchases =
                    restTemplate.getForObject("http://localhost:8087/listAll/"+ c.getId()
                            ,ResponseTemplateVO.class);
            customerList.add(customersWithPurchases);
        }
        return customerList;
    }





    public List<ResponseAll> getEveryone() {

//        ResponseAll vo =new ResponseAll();

        List<ResponseAll> listing =new ArrayList<>();

        for (Customer c :repository.findAll())
        {

            ResponseAll responseAll=
                    restTemplate.getForObject("http://localhost:8087/AllObject/"+c.getId(),ResponseAll.class);
            listing.add(responseAll);
        }
    return listing;
    }
}
