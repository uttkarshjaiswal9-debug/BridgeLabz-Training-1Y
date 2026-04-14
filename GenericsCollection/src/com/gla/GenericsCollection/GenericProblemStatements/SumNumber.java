package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;
public class SumNumber {
    public static double sumNumbers(List<? extends Number> list) {

        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Double> list2 = Arrays.asList(5.5, 2.5, 1.0);
        System.out.println(sumNumbers(list1));
        System.out.println(sumNumbers(list2));
    }
}