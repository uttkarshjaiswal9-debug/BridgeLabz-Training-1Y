package com.gla.Wrapper;

public class BooleanExample {
    public static void main(String[] args) {

        boolean b = true;
        Boolean obj = b; // autoboxing

        boolean b2 = obj; // unboxing

        System.out.println("Boolean Value: " + b2);
    }
}
