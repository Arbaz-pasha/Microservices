package com.microservice.service1.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {

    String address;
    String city;
    int pincode;
    int pid;
    int id;
}
