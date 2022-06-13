package com.assesment.assesment1.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CRepository extends JpaRepository<Customer,Integer> {


    Customer findCustomerById(Integer id);

}
