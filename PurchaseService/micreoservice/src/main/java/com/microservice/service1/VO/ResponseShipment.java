package com.microservice.service1.VO;

import com.microservice.service1.PurchaseOrder.Purchase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseShipment {

    private Purchase purchases ;
    private List<Shipment> shipmentLists;
}
