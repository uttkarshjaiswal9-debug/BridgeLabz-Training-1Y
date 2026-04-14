package com.gla.GenericsCollection.CollegeSystem;

public class Main {

    public static void main(String[] args) {

        AdmissionManager m = new AdmissionManager();

        m.addStudent(new Student("Aman", 80));
        m.addStudent(new Student("Rahul", 65));
        m.addStudent(new Student("Neha", 90));

        m.shortlist();
        m.prepareQueue();
        m.process();
        m.showMerit();
    }
}
