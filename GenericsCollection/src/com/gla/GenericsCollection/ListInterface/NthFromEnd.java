package com.gla.GenericsCollection.ListInterface;

import java.util.*;

public class NthFromEnd {

    public static <T> T find(LinkedList<T> list, int n) {

        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        for (int i = 0; i < n; i++) {
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
}
