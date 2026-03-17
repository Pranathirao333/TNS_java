package com.fooddelivery;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<FoodItem, Integer> items = new HashMap<>();

    public void addItem(FoodItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(FoodItem item) {
        items.remove(item);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }
}