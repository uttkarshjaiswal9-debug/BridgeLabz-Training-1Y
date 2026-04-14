package com.gla.GenericsCollection.MapInterface;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(WordFrequency.count("Hello world, hello Java!"));

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        System.out.println(InvertMap.invert(map));

        System.out.println(MaxValueKey.find(map));

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3);
        m2.put("C", 4);

        System.out.println(MergeMaps.merge(m1, m2));

        List<Employee> list = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        System.out.println(GroupByDept.group(list));
    }
}
