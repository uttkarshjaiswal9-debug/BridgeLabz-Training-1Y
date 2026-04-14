package com.gla.GenericsCollection.MapInterface;

import java.util.*;

public class MergeMaps {

    public static Map<String, Integer> merge(Map<String, Integer> m1, Map<String, Integer> m2) {

        Map<String, Integer> result = new HashMap<>(m1);

        for (String key : m2.keySet()) {
            result.put(key, result.getOrDefault(key, 0) + m2.get(key));
        }

        return result;
    }
}
