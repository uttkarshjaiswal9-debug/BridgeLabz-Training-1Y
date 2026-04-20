package com.gla.streamapi;
import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // This is the first way :
        Stream<String> stm = Stream.of("aa", "bb","cc");
        stm.forEach(System.out::println);
        // Now The second way to create:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("=============Using stream() method====================");
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);
       Stream<String> stream2 = Stream.of("Anubhav","Anushka","Virat","Rohit");
       stream2.filter(n->n.startsWith("A")).forEach(System.out::println);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(6);
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        Stream<Integer> Stream3 =list1.stream();
        Stream<Integer> FilterStream = Stream3.filter(i->i%2==0);
        FilterStream.forEach(System.out::println);

        list.stream().filter(i ->i%2==0).forEach(System.out::println);

    }

}
