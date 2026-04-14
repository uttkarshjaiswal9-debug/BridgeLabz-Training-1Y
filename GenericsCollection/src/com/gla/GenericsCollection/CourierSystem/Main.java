package com.gla.GenericsCollection.CourierSystem;

public class Main {

    public static void main(String[] args) {

        CourierManager m = new CourierManager();

        m.add(new Parcel("P1", 5));
        m.add(new Parcel("P2", 2));
        m.add(new Parcel("P1", 3));

        m.process();
    }
}
