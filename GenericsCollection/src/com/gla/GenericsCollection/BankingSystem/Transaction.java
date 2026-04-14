package com.gla.GenericsCollection.BankingSystem;

public class Transaction {

    private String accountId;
    private double amount;

    public Transaction(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return accountId + " -> " + amount;
    }
}