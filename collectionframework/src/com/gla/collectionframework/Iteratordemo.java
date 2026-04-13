package com.gla.collectionframework;
import java.util.*;

public class Iteratordemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}

