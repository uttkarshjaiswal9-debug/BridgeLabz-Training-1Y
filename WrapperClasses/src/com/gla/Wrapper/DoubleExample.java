package com.gla.Wrapper;

public class DoubleExample {
    public static void main(String[] args) {

        double d = 60.6;
        Double obj = d; // autoboxing

        double d2 = obj; // unboxing

        System.out.println("Double Value: " + d2);
    }
}
