package com.gla.GenericsCollection.FeedbackSystem;

public class Main {

    public static void main(String[] args) {

        FeedbackManager m = new FeedbackManager();

        m.add("Good");
        m.add("Bad");
        m.add("Good");

        m.process();
    }
}
