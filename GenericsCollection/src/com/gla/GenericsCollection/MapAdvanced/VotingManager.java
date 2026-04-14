package com.gla.GenericsCollection.MapAdvanced;

import java.util.*;

public class VotingManager {

    Map<String, Integer> votes = new HashMap<>();

    public void vote(String name) {
        votes.put(name, votes.getOrDefault(name, 0) + 1);
    }

    public void displayResults() {
        for (String name : votes.keySet()) {
            System.out.println(name + " : " + votes.get(name));
        }
    }

    public void winner() {
        String winner = null;
        int max = 0;

        for (String name : votes.keySet()) {
            if (votes.get(name) > max) {
                max = votes.get(name);
                winner = name;
            }
        }

        System.out.println("Winner: " + winner);
    }
}
