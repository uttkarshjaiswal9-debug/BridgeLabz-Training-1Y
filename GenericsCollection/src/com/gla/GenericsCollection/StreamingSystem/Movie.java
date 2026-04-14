package com.gla.GenericsCollection.StreamingSystem;

public class Movie {

    String name;
    String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name + " (" + genre + ")";
    }
}
