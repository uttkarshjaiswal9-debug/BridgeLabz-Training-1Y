package com.gla.GenericsCollection.GamingSystem;

import java.util.*;

public class TournamentManager {

    Set<Player> players = new HashSet<>();
    Queue<Match> matchQueue = new LinkedList<>();
    List<Result> results = new ArrayList<>();
    TreeSet<Score> leaderboard = new TreeSet<>();

    Map<Player, Score> scoreMap = new HashMap<>();

    public void registerPlayer(Player p) {
        if (players.add(p)) {
            Score s = new Score(p, 0);
            leaderboard.add(s);
            scoreMap.put(p, s);
        }
    }

    public void scheduleMatch(Match m) {
        matchQueue.add(m);
    }

    public void processMatches() {

        while (!matchQueue.isEmpty()) {

            Match m = matchQueue.remove();

            Player winner = m.getP1();

            Result r = new Result(m, winner);
            results.add(r);

            Score s = scoreMap.get(winner);
            leaderboard.remove(s);
            s.addPoint();
            leaderboard.add(s);

            System.out.println("Completed: " + r);
        }
    }

    public void showLeaderboard() {
        System.out.println("Leaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}