package com.gla.GenericsCollection.SetInterface;

import java.util.*;

public class SymmetricDifference {

    public static <T> Set<T> find(Set<T> s1, Set<T> s2) {

        Set<T> union = new HashSet<>(s1);
        union.addAll(s2);

        Set<T> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        union.removeAll(intersection);

        return union;
    }
}