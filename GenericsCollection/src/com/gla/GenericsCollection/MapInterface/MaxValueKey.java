package com.gla.GenericsCollection.MapInterface;

import java.util.*;

public class MaxValueKey {

    public static String find(Map<String, Integer> map) {

        String maxKey = null;
        int max = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }
}
