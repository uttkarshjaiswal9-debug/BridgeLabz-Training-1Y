package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class SalaryManager {

    Map<String, Double> map = new HashMap<>();

    public void add(String name, double salary) {
        map.put(name, salary);
    }

    public void raise(String name, double percent) {
        if (map.containsKey(name)) {
            double newSalary = map.get(name) + (map.get(name) * percent / 100);
            map.put(name, newSalary);
        } else {
            System.out.println("Employee not found");
        }
    }

    public void average() {
        double sum = 0;
        for (double v : map.values()) {
            sum += v;
        }
        System.out.println("Average: " + (sum / map.size()));
    }

    public void highest() {
        double max = Collections.max(map.values());
        for (String k : map.keySet()) {
            if (map.get(k) == max) {
                System.out.println("Highest Paid: " + k);
            }
        }
    }
}
