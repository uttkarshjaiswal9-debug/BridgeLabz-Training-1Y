package com.gla.GenericsCollection.BankingSystem;

import java.util.*;

public class BankManager {

    List<Transaction> allTransactions = new ArrayList<>();
    Queue<Transaction> queue = new LinkedList<>();
    Set<Account> accounts = new HashSet<>();
    Stack<Transaction> history = new Stack<>();

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void addTransaction(Transaction t) {
        queue.add(t);
    }

    public void processTransactions() {

        while (!queue.isEmpty()) {

            Transaction t = queue.remove();

            Account temp = new Account(t.getAccountId());

            if (accounts.contains(temp)) {
                System.out.println("Processed: " + t);
                allTransactions.add(t);
                history.push(t);
            } else {
                System.out.println("Invalid Account: " + t);
            }
        }
    }

    public void rollback() {

        if (!history.isEmpty()) {
            Transaction t = history.pop();
            allTransactions.remove(t);
            System.out.println("Rolled Back: " + t);
        }
    }
}
