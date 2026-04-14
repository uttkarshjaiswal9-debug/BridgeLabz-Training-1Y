package com.gla.GenericsCollection.ListInterface;

import java.util.*;

public class ReverseList {

    public static <T> List<T> reverse(List<T> list) {

        List<T> result = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }

        return result;
    }
}
