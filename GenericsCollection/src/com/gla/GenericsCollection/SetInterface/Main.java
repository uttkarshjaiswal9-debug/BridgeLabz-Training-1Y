package com.gla.GenericsCollection.SetInterface;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 2, 1));
        Set<Integer> s3 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Equal: " + SetEquality.isEqual(s1, s2));

        System.out.println("Union: " + SetOperations.union(s1, s3));
        System.out.println("Intersection: " + SetOperations.intersection(s1, s3));

        System.out.println("Symmetric Difference: " + SymmetricDifference.find(s1, s3));

        System.out.println("Sorted: " + SortSet.sort(new HashSet<>(Arrays.asList(5, 3, 9, 1))));

        System.out.println("Subset: " + SubsetCheck.isSubset(new HashSet<>(Arrays.asList(2, 3)),
                new HashSet<>(Arrays.asList(1, 2, 3, 4))));
    }
}
