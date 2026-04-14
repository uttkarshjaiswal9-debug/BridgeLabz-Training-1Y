package com.gla.GenericsCollection.WarehouseSystem;

import java.util.*;

public class WarehouseManager {

    Queue<PackageItem> pending = new LinkedList<>();
    Set<String> ids = new HashSet<>();
    List<PackageItem> delivered = new ArrayList<>();
    Stack<PackageItem> returned = new Stack<>();

    public void add(PackageItem p) {
        if (ids.add(p.getId())) {
            pending.add(p);
        }
    }

    public void process() {
        while (!pending.isEmpty()) {
            PackageItem p = pending.remove();
            delivered.add(p);
            System.out.println("Delivered: " + p);
        }
    }

    public void cancel(PackageItem p) {
        returned.push(p);
    }

    public void summary() {
        System.out.println("Delivered: " + delivered);
        System.out.println("Returned: " + returned);
    }
}
