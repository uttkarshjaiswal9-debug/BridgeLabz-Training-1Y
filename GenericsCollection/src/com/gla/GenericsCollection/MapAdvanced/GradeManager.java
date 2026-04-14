package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class GradeManager {

    Map<String, Double> map = new HashMap<>();

    public void add(String name, double grade) {
        map.put(name, grade);
    }

    public void update(String name, double grade) {
        map.put(name, grade);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public void display() {
        TreeMap<String, Double> sorted = new TreeMap<>(map);
        for (String k : sorted.keySet()) {
            System.out.println(k + " : " + sorted.get(k));
        }
    }

}
