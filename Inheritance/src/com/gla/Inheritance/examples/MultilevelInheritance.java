package com.gla.inheritance.examples;

class Person {

    void showPerson() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {

    void showStudent() {
        System.out.println("I am a Student");
    }
}

class CollegeStudent extends Student {

    void showCollege() {
        System.out.println("I study in College");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        CollegeStudent obj = new CollegeStudent();

        obj.showPerson();
        obj.showStudent();
        obj.showCollege();

    }
}