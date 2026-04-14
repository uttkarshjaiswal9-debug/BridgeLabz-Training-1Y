package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class CountryManager {

    Map<String, String> map = new HashMap<>();

    public void add(String country, String capital) {
        map.put(country, capital);
    }

    public void search(String country) {
        if (map.containsKey(country)) {
            System.out.println(map.get(country));
        } else {
            System.out.println("Unknown country");
        }
    }

    public void display() {
        TreeMap<String, String> sorted = new TreeMap<>(map);
        for (String c : sorted.keySet()) {
            System.out.println(c + " : " + sorted.get(c));
        }
    }
}
