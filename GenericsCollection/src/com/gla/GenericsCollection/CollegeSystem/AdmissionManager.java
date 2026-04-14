package com.gla.GenericsCollection.CollegeSystem;

import java.util.*;

public class AdmissionManager {

    List<Student> applicants = new ArrayList<>();
    Set<Student> shortlisted = new HashSet<>();
    Queue<Student> interviewQueue = new LinkedList<>();
    TreeSet<Student> meritList = new TreeSet<>();

    public void addStudent(Student s) {
        applicants.add(s);
    }

    public void shortlist() {
        for (Student s : applicants) {
            if (s.getMarks() >= 70) {
                shortlisted.add(s);
            }
        }
    }

    public void prepareQueue() {
        interviewQueue.addAll(shortlisted);
    }

    public void process() {
        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.remove();
            meritList.add(s);
            System.out.println("Selected: " + s);
        }
    }

    public void showMerit() {
        System.out.println("Merit List:");
        for (Student s : meritList) {
            System.out.println(s);
        }
    }
}
