package com.gla.GenericsCollection.ListInterface;

import java.util.*;

public class RotateList {

    public static <T> List<T> rotate(List<T> list, int k) {

        int n = list.size();
        k = k % n;

        List<T> result = new ArrayList<>();

        for (int i = k; i < n; i++) {
            result.add(list.get(i));
        }

        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        return result;
    }
}