package com.fooddelivery;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private int orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items = new HashMap<>();
    private String status = "Pending";
    private DeliveryPerson deliveryPerson;
    private String deliveryAddress;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addItem(FoodItem item, int quantity) {
        items.put(item, quantity);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    public String toString() {
        return "Order{orderId=" + orderId +
                ", customer=" + customer.getUsername() +
                ", items=" + items +
                ", status='" + status + "'" +
                ", deliveryPerson=" + deliveryPerson +
                "}";
    }
}