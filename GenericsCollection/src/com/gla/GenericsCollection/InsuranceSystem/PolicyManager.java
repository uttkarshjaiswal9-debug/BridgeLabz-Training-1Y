package com.gla.GenericsCollection.InsuranceSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedSet.add(p);
        treeSet.add(p);
    }

    public void displayAll() {
        System.out.println("All Policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    public void expiringSoon() {
        LocalDate today = LocalDate.now();

        System.out.println("Expiring Soon:");
        for (Policy p : hashSet) {
            if (p.getExpiryDate().isBefore(today.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    public void filterByCoverage(String type) {
        System.out.println("Coverage Type: " + type);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    public void showSorted() {
        System.out.println("Sorted by Expiry:");
        for (Policy p : treeSet) {
            System.out.println(p);
        }
    }
}
