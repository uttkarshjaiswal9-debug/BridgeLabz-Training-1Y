package com.gla.GenericsCollection.HospitalSystem;

import java.util.*;

public class HospitalManager {

    Set<Patient> admitted = new HashSet<>();
    Queue<Patient> queue = new LinkedList<>();
    Stack<Patient> discharged = new Stack<>();
    List<Patient> history = new ArrayList<>();

    public void admit(Patient p) {
        if (admitted.add(p)) {
            queue.add(p);
        }
    }

    public void treat() {
        while (!queue.isEmpty()) {
            Patient p = queue.remove();
            history.add(p);
            discharged.push(p);
            System.out.println("Treated: " + p);
        }
    }

    public void readmit() {
        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            queue.add(p);
            System.out.println("Readmitted: " + p);
        }
    }
}