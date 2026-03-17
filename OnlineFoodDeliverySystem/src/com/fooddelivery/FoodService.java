package com.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

    private List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
        System.out.println("Restaurant added successfully!");
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void viewRestaurants() {
        for (Restaurant r : restaurants) {
            System.out.println("Restaurant ID: " + r.getId() + ", Name: " + r.getName());
        }
    }
}