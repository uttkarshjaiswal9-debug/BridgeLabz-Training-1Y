package com.gla.collectionframework;
import java.util.*;


public class CollectionFrameworkPractice2 {
    public void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<String> l1 = new LinkedList<>();
        Vector<Double> vector = new Vector<>();
        Stack<Boolean> stack = new Stack<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.set(0,12);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(10));

    }
}