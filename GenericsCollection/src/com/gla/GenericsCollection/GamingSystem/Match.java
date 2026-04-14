package com.gla.GenericsCollection.GamingSystem;

public class Match {

    private Player p1;
    private Player p2;

    public Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public String toString() {
        return p1 + " vs " + p2;
    }
}
