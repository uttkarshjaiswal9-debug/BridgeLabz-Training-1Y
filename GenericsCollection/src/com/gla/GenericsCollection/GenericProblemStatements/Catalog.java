package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class Catalog {

    private List<GenericProduct<?>> products = new ArrayList<>();

    public void addProduct(GenericProduct<?> product) {
        products.add(product);
    }

    public void display() {
        for (GenericProduct<?> p : products) {
            System.out.println(p);
        }
    }
}
