package com.gla.GenericsCollection.SportsSystem;

public class Team implements Comparable<Team> {

    String name;
    int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int compareTo(Team t) {
        return t.points - this.points;
    }

    public String toString() {
        return name + " : " + points;
    }
}
