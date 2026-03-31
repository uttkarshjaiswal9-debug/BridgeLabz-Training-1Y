package com.gla.Wrapper;

public class ShortExample {
    public static void main(String[] args) {

        short s = 20;
        Short obj = s; // autoboxing

        short s2 = obj; // unboxing

        System.out.println("Short Value: " + s2);
    }
}
