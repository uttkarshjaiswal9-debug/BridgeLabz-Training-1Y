package com.gla.GenericsCollection.GamingSystem;

public class Result {

    private Match match;
    private Player winner;

    public Result(Match match, Player winner) {
        this.match = match;
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }

    public String toString() {
        return match + " -> Winner: " + winner;
    }
}
