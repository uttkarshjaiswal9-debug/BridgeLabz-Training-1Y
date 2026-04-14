package com.gla.GenericsCollection.WarehouseSystem;

public class Main {

    public static void main(String[] args) {

        WarehouseManager m = new WarehouseManager();

        m.add(new PackageItem("P1"));
        m.add(new PackageItem("P2"));
        m.add(new PackageItem("P1"));

        m.process();

        m.cancel(new PackageItem("P2"));

        m.summary();
    }
}
