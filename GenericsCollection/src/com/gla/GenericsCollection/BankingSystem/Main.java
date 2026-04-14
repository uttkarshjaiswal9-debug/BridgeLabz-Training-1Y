package com.gla.GenericsCollection.BankingSystem;

public class Main {

    public static void main(String[] args) {

        BankManager manager = new BankManager();

        manager.addAccount(new Account("A1"));
        manager.addAccount(new Account("A2"));

        manager.addTransaction(new Transaction("A1", 1000));
        manager.addTransaction(new Transaction("A2", 2000));
        manager.addTransaction(new Transaction("A3", 3000));

        manager.processTransactions();

        manager.rollback();
    }
}
