package com.gla.GenericsCollection.FeedbackSystem;

import java.util.*;

public class FeedbackManager {

    List<String> all = new ArrayList<>();
    Set<String> unique = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    Stack<String> recent = new Stack<>();

    public void add(String f) {
        all.add(f);
        if (unique.add(f)) {
            queue.add(f);
        }
    }

    public void process() {
        while (!queue.isEmpty()) {
            String f = queue.remove();
            recent.push(f);
            System.out.println("Processed: " + f);
        }
    }
}
