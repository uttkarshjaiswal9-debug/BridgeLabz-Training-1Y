package com.gla.GenericsCollection.ListInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("ArrayList Reverse: " + ReverseList.reverse(arrayList));
        System.out.println("LinkedList Reverse: " + ReverseList.reverse(linkedList));

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = Frequency.countFrequency(list);

        System.out.println(result);

        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Rotated List: " + RotateList.rotate(list2, 2));

        List<Integer> dupList = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Without Duplicates: " + RemoveDuplicates.remove(dupList));


        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Nth from End: " + NthFromEnd.find(ll, 2));
    }
}
