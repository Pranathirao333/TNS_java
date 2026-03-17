package com.fooddelivery;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getUserId(), customer);
        System.out.println("Customer created successfully!");
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public Map<Integer, Customer> getAllCustomers() {
        return customers;
    }
}