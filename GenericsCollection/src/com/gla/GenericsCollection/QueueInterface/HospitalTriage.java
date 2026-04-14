package com.gla.GenericsCollection.QueueInterface;

import java.util.*;

class Patient implements Comparable<Patient> {

    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient p) {
        return p.severity - this.severity;
    }

    public String toString() {
        return name;
    }
}

public class HospitalTriage {

    public static void process() {

        PriorityQueue<Patient> pq = new PriorityQueue<>();

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
