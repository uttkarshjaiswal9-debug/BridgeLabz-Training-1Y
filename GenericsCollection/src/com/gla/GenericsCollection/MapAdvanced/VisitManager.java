package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class VisitManager {

    Map<String, Integer> map = new HashMap<>();

    public void visit(String page) {
        map.put(page, map.getOrDefault(page, 0) + 1);
    }

    public void report() {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Top Page: " + list.get(0).getKey());
    }
}
