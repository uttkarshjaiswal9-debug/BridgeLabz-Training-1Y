package com.gla.GenericsCollection.GamingSystem;

public class Score implements Comparable<Score> {

    private Player player;
    private int points;

    public Score(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    public Player getPlayer() {
        return player;
    }

    public int getPoints() {
        return points;
    }

    public void addPoint() {
        points++;
    }

    public int compareTo(Score s) {
        return s.points - this.points;
    }

    public String toString() {
        return player + " : " + points;
    }
}
