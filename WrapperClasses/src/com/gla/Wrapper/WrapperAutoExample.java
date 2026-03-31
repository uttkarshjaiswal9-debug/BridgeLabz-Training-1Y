package com.gla.Wrapper;

public class WrapperAutoExample {
    public static void main(String[] args) {
        int a = 10; //primitive


// Integer val1= Integer.valueOf(a); // internally conversion through compiler

        Integer value= a; // Autoboxing (converting primitive to objects)
        System.out.println("Value: "+value);
        System.out.println("-------------------------------");


//int i3 = value.intValue();// internally compiler converting objects to primitive.
        int unbox= value; //Manual Conversion
        System.out.println("Unboxing "+unbox);


    }
}