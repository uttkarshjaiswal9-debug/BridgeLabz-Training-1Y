package com.gla.GenericsCollection.RideSystem;

public class Main {

    public static void main(String[] args) {

        RideManager manager = new RideManager();

        manager.addDriver(new Driver("Driver1"));
        manager.addDriver(new Driver("Driver2"));
        manager.addDriver(new Driver("Driver3"));

        manager.addRequest(new RideRequest("Aman", 2));
        manager.addRequest(new RideRequest("Rahul", 5));
        manager.addRequest(new RideRequest("Neha", 3));

        manager.processPriorityRides();

        manager.showCompleted();
    }
}