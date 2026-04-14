package com.gla.GenericsCollection.MapInterface;

import java.util.*;

public class InvertMap {

    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {

        Map<V, List<K>> result = new HashMap<>();

        for (K key : map.keySet()) {
            V value = map.get(key);

            result.putIfAbsent(value, new ArrayList<>());
            result.get(value).add(key);
        }

        return result;
    }
}
