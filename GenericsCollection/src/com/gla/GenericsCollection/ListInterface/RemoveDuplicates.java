package com.gla.GenericsCollection.ListInterface;

import java.util.*;

public class RemoveDuplicates {

    public static <T> List<T> remove(List<T> list) {

        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}
