package com.gla.GenericsCollection.MapInterface;

import java.util.*;

public class WordFrequency {

    public static Map<String, Integer> count(String text) {

        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        return map;
    }
}
