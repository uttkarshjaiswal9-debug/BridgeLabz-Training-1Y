package com.gla.GenericsCollection.GenericProblemStatements;

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}
