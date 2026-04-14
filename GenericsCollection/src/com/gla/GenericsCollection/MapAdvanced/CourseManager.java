package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class CourseManager {

    Map<String, Integer> map = new HashMap<>();

    public void add(String course, int count) {
        map.put(course, count);
    }

    public void enroll(String course) {
        map.put(course, map.getOrDefault(course, 0) + 1);
    }

    public void drop(String course) {
        if (map.containsKey(course) && map.get(course) > 0) {
            map.put(course, map.get(course) - 1);
        }
    }

    public void display() {
        for (String c : map.keySet()) {
            System.out.println(c + " : " + map.get(c));
        }
    }

    public void fullCourses() {
        System.out.println("Full Courses:");
        for (String c : map.keySet()) {
            if (map.get(c) >= 50) {
                System.out.println(c);
            }
        }
    }

    public void lowCourses() {
        System.out.println("Low Enrollment:");
        for (String c : map.keySet()) {
            if (map.get(c) < 5) {
                System.out.println(c);
            }
        }
    }
}
