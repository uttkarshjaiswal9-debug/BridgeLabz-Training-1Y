package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class AnimalTest {

    public static void printAnimals(List<? extends Animal> animals) {

        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog("Tommy"), new Dog("Rocky"));
        List<Cat> cats = Arrays.asList(new Cat("Kitty"), new Cat("Misty"));

        printAnimals(dogs);
        printAnimals(cats);
    }
}
