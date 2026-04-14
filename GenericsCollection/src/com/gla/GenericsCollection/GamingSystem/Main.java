package com.gla.GenericsCollection.GamingSystem;

public class Main {

    public static void main(String[] args) {

        TournamentManager manager = new TournamentManager();

        Player p1 = new Player("Aman");
        Player p2 = new Player("Rahul");
        Player p3 = new Player("Neha");

        manager.registerPlayer(p1);
        manager.registerPlayer(p2);
        manager.registerPlayer(p3);

        manager.scheduleMatch(new Match(p1, p2));
        manager.scheduleMatch(new Match(p2, p3));
        manager.scheduleMatch(new Match(p1, p3));

        manager.processMatches();

        manager.showLeaderboard();
    }
}
