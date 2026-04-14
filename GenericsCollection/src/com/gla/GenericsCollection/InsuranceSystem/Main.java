package com.gla.GenericsCollection.InsuranceSystem;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P1", "Aman",
                LocalDate.now().plusDays(10), "Health", 5000));

        manager.addPolicy(new Policy("P2", "Rahul",
                LocalDate.now().plusDays(40), "Auto", 3000));

        manager.addPolicy(new Policy("P3", "Neha",
                LocalDate.now().plusDays(20), "Home", 7000));

        manager.addPolicy(new Policy("P1", "Duplicate",
                LocalDate.now().plusDays(5), "Health", 4000)); // duplicate

        manager.displayAll();

        manager.expiringSoon();

        manager.filterByCoverage("Health");

        manager.showSorted();
    }
}
