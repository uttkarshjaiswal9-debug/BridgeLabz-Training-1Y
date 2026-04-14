package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class CartManager {

    LinkedHashMap<String, Double> map = new LinkedHashMap<>();

    public void add(String item, double price) {
        map.put(item, price);
    }

    public void remove(String item) {
        map.remove(item);
    }

    public void display() {
        for (String k : map.keySet()) {
            System.out.println(k + " : " + map.get(k));
        }
    }

    public void bill() {
        double total = 0;
        for (double v : map.values()) {
            total += v;
        }

        if (total > 5000) {
            total *= 0.9;
        }

        System.out.println("Total: " + total);
    }
}
