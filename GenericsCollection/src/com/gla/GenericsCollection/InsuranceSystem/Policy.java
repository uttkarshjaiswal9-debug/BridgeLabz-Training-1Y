package com.gla.GenericsCollection.InsuranceSystem;

import java.time.LocalDate;

public class Policy implements Comparable<Policy> {

    private String policyNumber;
    private String name;
    private LocalDate expiryDate;
    private String coverageType;
    private double premium;

    public Policy(String policyNumber, String name, LocalDate expiryDate,
                  String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNumber.equals(p.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public String toString() {
        return policyNumber + " | " + name + " | " + expiryDate +
                " | " + coverageType + " | " + premium;
    }
}