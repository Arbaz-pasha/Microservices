package com.shipment.API.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private int pid;
    private String name;
    private int quantity;
    private int pricing;
    private int mrp;
    private int id;
}
