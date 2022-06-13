package com.assesment.assesment1.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Customer {

    @Id
    private int id;
    private String name;
    private String city;
    private int number;
    private String email;


    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public Customer(int id, String name, String city, int number, String email) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.city = city;
        this.id = id;
    }



}
