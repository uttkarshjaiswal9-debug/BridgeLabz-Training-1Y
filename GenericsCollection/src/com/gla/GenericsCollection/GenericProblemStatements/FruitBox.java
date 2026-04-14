package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T f : fruits) {
            System.out.println(f);
        }
    }
}
