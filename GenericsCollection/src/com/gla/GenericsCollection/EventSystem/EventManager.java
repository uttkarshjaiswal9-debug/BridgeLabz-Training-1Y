package com.gla.GenericsCollection.EventSystem;

import java.util.*;

public class EventManager {

    List<Booking> all = new ArrayList<>();
    Set<String> users = new HashSet<>();
    Queue<Booking> queue = new LinkedList<>();
    PriorityQueue<Booking> pq = new PriorityQueue<>();

    public void register(String user) {
        users.add(user);
    }

    public void book(Booking b) {
        if (users.contains(b.name)) {
            queue.add(b);
            pq.add(b);
        }
    }

    public void process() {
        while (!pq.isEmpty()) {
            Booking b = pq.remove();
            all.add(b);
            System.out.println("Confirmed: " + b);
        }
    }
}
