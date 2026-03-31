package com.gla.Wrapper;

public class CharacterExample {
    public static void main(String[] args) {

        char c = 'A';
        Character obj = c; // autoboxing

        char c2 = obj; // unboxing

        System.out.println("Character Value: " + c2);
    }
}
