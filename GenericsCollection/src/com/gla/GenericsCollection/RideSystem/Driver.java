package com.gla.GenericsCollection.RideSystem;

public class Driver {

    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return name.equals(d.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
