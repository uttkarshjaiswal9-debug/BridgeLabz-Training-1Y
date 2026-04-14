package com.gla.GenericsCollection.RideSystem;

public class Ride {

    private RideRequest request;
    private Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    public String toString() {
        return request + " -> Driver: " + driver;
    }
}
