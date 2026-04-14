package com.gla.GenericsCollection.GenericProblemStatements;

public class GenericProduct<T> {
    String name;
    double price;
    T category;

    public GenericProduct(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return name + " - " + price + " - " + category;
    }
}
