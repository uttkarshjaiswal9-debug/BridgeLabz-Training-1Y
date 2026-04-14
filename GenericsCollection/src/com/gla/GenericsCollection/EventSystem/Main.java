package com.gla.GenericsCollection.EventSystem;

public class Main {

    public static void main(String[] args) {

        EventManager m = new EventManager();

        m.register("Aman");
        m.register("Rahul");

        m.book(new Booking("Aman", true));
        m.book(new Booking("Rahul", false));

        m.process();
    }
}