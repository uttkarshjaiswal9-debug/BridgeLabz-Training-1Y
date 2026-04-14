package com.gla.GenericsCollection.EventSystem;

public class Booking implements Comparable<Booking> {

    String name;
    boolean vip;

    public Booking(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public int compareTo(Booking b) {
        return Boolean.compare(b.vip, this.vip);
    }

    public String toString() {
        return name + (vip ? " (VIP)" : "");
    }
}
