package com.fooddelivery;

public class DeliveryPerson {

    private int deliveryPersonId;
    private String name;
    private long contactNo;

    public DeliveryPerson(int id, String name, long contactNo) {
        this.deliveryPersonId = id;
        this.name = name;
        this.contactNo = contactNo;
    }
}