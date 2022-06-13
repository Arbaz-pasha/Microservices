package com.assesment.assesment1.VO;


import com.assesment.assesment1.Customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAll {

    private Customer customer;
    private List<Purchase> purchase ;
    private List<Shipment> shipmentLists;

}
