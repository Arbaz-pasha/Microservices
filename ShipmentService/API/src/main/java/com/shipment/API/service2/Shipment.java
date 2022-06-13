package com.shipment.API.service2;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity
public class Shipment {


    String address;
    String city;
    int pincode;
    @Id
    int pid;
    int id;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
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

    public Shipment(String address, String city, int pincode, int pid, int id) {
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.pid = pid;
        this.id = id;
    }



    public Shipment() {
    }



}
