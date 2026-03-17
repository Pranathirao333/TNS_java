package com.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed successfully!");
    }

    public void viewOrders() {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}