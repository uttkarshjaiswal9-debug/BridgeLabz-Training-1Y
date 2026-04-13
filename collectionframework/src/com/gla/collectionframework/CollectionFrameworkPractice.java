package com.gla.collectionframework;

import java.util.*;


public class CollectionFrameworkPractice {
    public static void main(String[] args) {
        List l = new ArrayList();
        List l2 = new LinkedList();
        List l3 = new Vector();
        List l4 = new Stack();
        l.add(10);
        l.add(10);
        l.add("Uttkarsh");
        l.add(5.55);
        System.out.println(l);
        for(int i=0; i<l.size();i++){
            System.out.println(l.get(i));
        }
        for(Object i: l){
            System.out.println(i);
        }
        System.out.println(l.contains(10));
      l.remove(1);
      System.out.println(l);
      System.out.println(l.isEmpty());

    }
}
