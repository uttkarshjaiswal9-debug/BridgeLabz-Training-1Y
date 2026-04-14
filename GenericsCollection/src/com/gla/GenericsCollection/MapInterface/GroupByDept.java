package com.gla.GenericsCollection.MapInterface;

import java.util.*;

public class GroupByDept {

    public static Map<String, List<Employee>> group(List<Employee> list) {

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }

        return map;
    }
}
