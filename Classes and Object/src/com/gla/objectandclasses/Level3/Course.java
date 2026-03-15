package com.gla.objectandclasses.Level3;

public class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "GLA University";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java", 6, 15000);
        Course c2 = new Course("Python", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("GLA Institute of Technology");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
