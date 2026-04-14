package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class WordFrequency {

    public static void count(String text) {

        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String w : map.keySet()) {
            System.out.println(w + " : " + map.get(w));
        }
    }
}
