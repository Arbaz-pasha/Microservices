package com.assesment.assesment1.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {

    int id;
    String address;
    String city;
    int pincode;
    int pid;
}
