package com.gla.GenericsCollection.SportsSystem;

public class Main {

    public static void main(String[] args) {

        SportsManager m = new SportsManager();

        m.addTeam(new Team("A", 10));
        m.addTeam(new Team("B", 20));

        m.schedule("A vs B");

        m.process();
        m.show();
    }
}
