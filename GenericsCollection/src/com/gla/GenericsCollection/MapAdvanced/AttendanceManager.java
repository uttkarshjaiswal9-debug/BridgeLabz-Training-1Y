package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class AttendanceManager {

    Map<String, Integer> map = new HashMap<>();

    public void addStudent(String name) {
        map.put(name, 0);
    }

    public void markPresent(List<String> presentList) {
        for (String name : presentList) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
        }
    }

    public void showLowAttendance(int limit) {
        for (String name : map.keySet()) {
            if (map.get(name) < limit) {
                System.out.println(name + " : " + map.get(name));
            }
        }
    }
}
