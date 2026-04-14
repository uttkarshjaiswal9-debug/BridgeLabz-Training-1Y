package com.gla.GenericsCollection.SetInterface;

import java.util.*;

public class SetEquality {

    public static <T> boolean isEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }
}
