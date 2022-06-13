package com.microservice.service1.PurchaseOrder;


import javax.persistence.*;

@Table
@Entity
public class Purchase {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String name;
    private int quantity;
    private int pricing;
    private int mrp;

    private int id;

    public Purchase(){}
    public Purchase(int pid,String name, int quantity, int pricing, int mrp,  int id) {

        this.pid = pid;
        this.name = name;
        this.quantity = quantity;
        this.pricing = pricing;
        this.mrp = mrp;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricing() {
        return pricing;
    }

    public void setPricing(int pricing) {
        this.pricing = pricing;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
