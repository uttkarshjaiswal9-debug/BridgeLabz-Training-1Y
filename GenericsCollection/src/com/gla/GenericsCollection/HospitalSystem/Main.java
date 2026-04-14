package com.gla.GenericsCollection.HospitalSystem;

public class Main {

    public static void main(String[] args) {

        HospitalManager m = new HospitalManager();

        m.admit(new Patient("Aman"));
        m.admit(new Patient("Rahul"));

        m.treat();

        m.readmit();
    }
}
