package com.gla.GenericsCollection.RideSystem;

public class RideRequest implements Comparable<RideRequest> {

    private String customer;
    private int priority;

    public RideRequest(String customer, int priority) {
        this.customer = customer;
        this.priority = priority;
    }

    public String getCustomer() {
        return customer;
    }

    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }

    public String toString() {
        return customer + " (Priority: " + priority + ")";
    }
}
