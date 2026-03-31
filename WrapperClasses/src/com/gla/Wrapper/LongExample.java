package com.gla.Wrapper;

public class LongExample {
    public static void main(String[] args) {

        long l = 40L;
        Long obj = l; // autoboxing

        long l2 = obj; // unboxing

        System.out.println("Long Value: " + l2);
    }
}
