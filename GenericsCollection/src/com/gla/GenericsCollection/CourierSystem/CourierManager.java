package com.gla.GenericsCollection.CourierSystem;

import java.util.*;

public class CourierManager {

    PriorityQueue<Parcel> pq = new PriorityQueue<>();
    Set<String> ids = new HashSet<>();
    List<Parcel> completed = new ArrayList<>();
    Queue<Parcel> normal = new LinkedList<>();

    public void add(Parcel p) {
        if (ids.add(p.id)) {
            pq.add(p);
        }
    }

    public void process() {
        while (!pq.isEmpty()) {
            Parcel p = pq.remove();
            completed.add(p);
            System.out.println("Delivered: " + p);
        }
    }
}
