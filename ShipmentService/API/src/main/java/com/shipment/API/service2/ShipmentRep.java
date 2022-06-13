package com.shipment.API.service2;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRep extends JpaRepository<Shipment,Integer> {
    Shipment getShipmentByPid(int pid);
}
