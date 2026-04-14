package com.gla.GenericsCollection.StreamingSystem;

public class Main {

    public static void main(String[] args) {

        StreamingManager m = new StreamingManager();

        m.add(new Movie("Movie1", "Action"));
        m.add(new Movie("Movie2", "Drama"));

        m.watch();
        m.watch();
    }
}
