package com.example.rockm.hackaton;

import java.io.Serializable;

/**
 * Created by rockm on 11/4/2017.
 */

public class Job implements Serializable {

    private String description;
    private String money;
    private String location;
    private String email,phone;
    private boolean isFav;
    private String name,web;


    public Job(String name,String web ,String money,String location,String email,String phone, String description) {
        this.web = web;
        this.name = name;
        this.email = email;
        this.location  = location;
        this.money = money;
        this.phone = phone;
        this.description   =description;
    }

    public String getWeb() {
        return  web;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setDescription(String description){

        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setIsFav(boolean isFav) {

        this.isFav = isFav;
    }
    public  boolean getIsFav() {

        return  isFav;
    }
    public String getName() {

        return name;
    }
}
