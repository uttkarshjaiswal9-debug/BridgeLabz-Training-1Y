package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class DeptManager {

    Map<Integer, String> map = new HashMap<>();

    public void add(int id, String dept) {
        map.put(id, dept);
    }

    public void update(int id, String dept) {
        map.put(id, dept);
    }

    public void findByDept(String dept) {
        for (int id : map.keySet()) {
            if (map.get(id).equals(dept)) {
                System.out.println(id);
            }
        }
    }

    public void countDept() {

        Map<String, Integer> count = new HashMap<>();

        for (String d : map.values()) {
            count.put(d, count.getOrDefault(d, 0) + 1);
        }

        System.out.println(count);
    }
}
