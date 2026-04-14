package com.gla.GenericsCollection.ListInterface;

import java.util.*;

public class Frequency {

    public static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        for (String item : list) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        return map;
    }
}
