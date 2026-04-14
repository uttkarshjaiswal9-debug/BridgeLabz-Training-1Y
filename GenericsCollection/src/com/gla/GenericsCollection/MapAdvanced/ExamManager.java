package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class ExamManager {

    Map<String, Map<String, Integer>> map = new HashMap<>();

    public void add(String subject, String student, int marks) {
        map.putIfAbsent(subject, new HashMap<>());
        map.get(subject).put(student, marks);
    }

    public void topper() {
        for (String sub : map.keySet()) {

            int max = 0;
            String top = "";

            for (String s : map.get(sub).keySet()) {
                int m = map.get(sub).get(s);
                if (m > max) {
                    max = m;
                    top = s;
                }
            }

            System.out.println(sub + " Topper: " + top);
        }
    }

    public void average() {
        for (String sub : map.keySet()) {

            int sum = 0;
            int count = 0;

            for (int m : map.get(sub).values()) {
                sum += m;
                count++;
            }

            System.out.println(sub + " Avg: " + (sum / count));
        }
    }

    public void above90() {
        for (String sub : map.keySet()) {
            for (int m : map.get(sub).values()) {
                if (m > 90) {
                    System.out.println(sub);
                    break;
                }
            }
        }
    }
}
