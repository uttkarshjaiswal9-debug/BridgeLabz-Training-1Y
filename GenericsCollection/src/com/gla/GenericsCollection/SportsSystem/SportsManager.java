package com.gla.GenericsCollection.SportsSystem;

import java.util.*;

public class SportsManager {

    Set<Team> teams = new HashSet<>();
    Queue<String> matches = new LinkedList<>();
    List<String> results = new ArrayList<>();
    TreeSet<Team> leaderboard = new TreeSet<>();

    public void addTeam(Team t) {
        teams.add(t);
        leaderboard.add(t);
    }

    public void schedule(String match) {
        matches.add(match);
    }

    public void process() {
        while (!matches.isEmpty()) {
            String m = matches.remove();
            results.add(m);
            System.out.println("Played: " + m);
        }
    }

    public void show() {
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}
