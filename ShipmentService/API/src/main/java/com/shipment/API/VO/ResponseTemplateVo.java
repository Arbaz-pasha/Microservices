package com.shipment.API.VO;


import com.shipment.API.service2.Shipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

    private Customer customers;
    private List<Shipment> ShipmentList;

}
