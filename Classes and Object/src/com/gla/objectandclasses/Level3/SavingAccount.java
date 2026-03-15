package com.gla.objectandclasses.Level3;

public class SavingAccount extends BankAccount {

    public SavingAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {

        SavingAccount s = new SavingAccount(101, "Uttkarsh", 5000);

        s.deposit(2000);
        s.withdraw(1000);

        s.display();
    }
}
