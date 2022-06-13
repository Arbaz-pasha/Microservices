package com.microservice.service1.PurchaseOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PurchaseRep extends JpaRepository<Purchase,Integer> {


    Purchase findPurchaseByPid(Integer pid);
}
