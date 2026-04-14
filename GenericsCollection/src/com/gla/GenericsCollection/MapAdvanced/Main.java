package com.gla.GenericsCollection.MapAdvanced;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        GradeManager m = new GradeManager();

        m.add("Aman", 85);
        m.add("Rahul", 90);

        m.update("Aman", 95);

        m.remove("Rahul");

        m.display();

        VotingManager v = new VotingManager();

        v.vote("Aman");
        v.vote("Rahul");
        v.vote("Aman");
        v.vote("Neha");
        v.vote("Aman");
        v.vote("Rahul");
        v.vote("Neha");
        v.vote("Rahul");
        v.vote("Rahul");
        v.vote("Neha");

        v.displayResults();
        v.winner();

        LibraryManager l = new LibraryManager();

        l.add("101", "Java");
        l.add("102", "DSA");
        l.add("103", "OS");

        l.search("102");

        l.remove("103");

        l.display();

        l.searchByTitle("Java");

        WordFrequency.count("Java is fun and Java is powerful");

        AttendanceManager n = new AttendanceManager();

        n.addStudent("Aman");
        n.addStudent("Rahul");
        n.addStudent("Neha");

        n.markPresent(Arrays.asList("Aman", "Rahul"));
        n.markPresent(Arrays.asList("Aman"));
        n.markPresent(Arrays.asList("Rahul", "Neha"));

        n.showLowAttendance(2);

        CountryManager c = new CountryManager();

        c.add("India", "New Delhi");
        c.add("USA", "Washington");
        c.add("Japan", "Tokyo");
        c.add("France", "Paris");
        c.add("Germany", "Berlin");
        c.add("Italy", "Rome");
        c.add("China", "Beijing");
        c.add("Canada", "Ottawa");

        c.search("India");
        c.search("Brazil");

        c.display();

        CourseManager s = new CourseManager();

        s.add("CS101", 45);
        s.add("CS102", 60);
        s.add("CS103", 3);
        s.add("CS104", 20);
        s.add("CS105", 2);

        s.enroll("CS101");
        s.drop("CS104");

        s.display();

        s.fullCourses();
        s.lowCourses();

        SalaryManager manager = new SalaryManager();

        manager.add("Aman", 50000);
        manager.add("Rahul", 60000);
        manager.add("Neha", 55000);
        manager.add("Riya", 70000);
        manager.add("Karan", 45000);
        manager.add("Simran", 70000);

        manager.raise("Aman", 10);
        manager.raise("Neha", 5);

        manager.average();
        manager.highest();

        VisitManager p = new VisitManager();

        p.visit("home");
        p.visit("about");
        p.visit("products");
        p.visit("home");
        p.visit("products");
        p.visit("contact");
        p.visit("home");

        p.report();


    }
}
