package com.gla.GenericsCollection.BankingSystem;

public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public String toString() {
        return accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return accountId.equals(a.accountId);
    }

    @Override
    public int hashCode() {
        return accountId.hashCode();
    }
}

