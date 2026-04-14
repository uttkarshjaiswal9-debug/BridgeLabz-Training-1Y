package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class BankManager {

    Map<String, Double> map = new HashMap<>();

    public void add(String acc, double balance) {
        map.put(acc, balance);
    }

    public void deposit(String acc, double amt) {
        map.put(acc, map.getOrDefault(acc, 0.0) + amt);
    }

    public void withdraw(String acc, double amt) {
        if (map.containsKey(acc) && map.get(acc) >= amt) {
            map.put(acc, map.get(acc) - amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {

        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Top 3:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey());
        }
    }
}
