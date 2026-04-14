package com.gla.GenericsCollection.StreamingSystem;

import java.util.*;

public class StreamingManager {

    Stack<Movie> history = new Stack<>();
    List<Movie> all = new ArrayList<>();
    Set<String> genres = new HashSet<>();
    Queue<Movie> next = new LinkedList<>();

    public void add(Movie m) {
        all.add(m);
        next.add(m);
    }

    public void watch() {
        Movie m = next.remove();
        history.push(m);
        genres.add(m.genre);
        System.out.println("Watching: " + m);
    }
}
