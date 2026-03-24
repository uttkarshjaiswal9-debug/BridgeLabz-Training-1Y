package com.gla.inheritance.examples;

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car drives");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike rides");
    }
}

public class HierarchicalInheritance{

    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
