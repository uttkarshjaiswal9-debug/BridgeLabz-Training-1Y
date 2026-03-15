package com.gla.objectandclasses.Level3;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCgpa());
    }

    public static void main(String[] args) {

        PostgraduateStudent p = new PostgraduateStudent(101, "Uttkarsh", 8.5);

        p.setCgpa(9.1);

        p.display();
    }
}
