package com.gla.Wrapper;

public class ByteExample {
    public static void main(String[] args) {

        byte b = 10;
        Byte obj = b; // autoboxing

        byte b2 = obj; // unboxing

        System.out.println("Byte Value: " + b2);
    }
}
