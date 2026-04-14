package com.gla.GenericsCollection.RideSystem;

import java.util.*;

public class RideManager {

    Queue<RideRequest> normalQueue = new LinkedList<>();
    PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
    Set<Driver> drivers = new HashSet<>();
    List<Ride> completedRides = new ArrayList<>();

    public void addRequest(RideRequest r) {
        normalQueue.add(r);
        priorityQueue.add(r);
    }

    public void addDriver(Driver d) {
        drivers.add(d);
    }

    public void processPriorityRides() {

        while (!priorityQueue.isEmpty() && !drivers.isEmpty()) {

            RideRequest req = priorityQueue.poll();
            Driver driver = drivers.iterator().next();
            drivers.remove(driver);

            Ride ride = new Ride(req, driver);
            completedRides.add(ride);

            System.out.println("Completed: " + ride);
        }
    }

    public void showCompleted() {
        System.out.println("Ride History:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}
