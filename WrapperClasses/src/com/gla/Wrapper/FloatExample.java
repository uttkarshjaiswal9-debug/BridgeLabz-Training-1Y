package com.gla.Wrapper;

public class FloatExample {
    public static void main(String[] args) {

        float f = 50.5f;
        Float obj = f; // autoboxing

        float f2 = obj; // unboxing

        System.out.println("Float Value: " + f2);
    }
}
