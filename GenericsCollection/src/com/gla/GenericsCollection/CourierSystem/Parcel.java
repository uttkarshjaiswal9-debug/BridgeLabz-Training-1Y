package com.gla.GenericsCollection.CourierSystem;

public class Parcel implements Comparable<Parcel> {

    String id;
    int priority;

    public Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }

    public String toString() {
        return id + " (" + priority + ")";
    }
}
