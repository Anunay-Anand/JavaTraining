package org.polymorphism;

public abstract class Account {
    int balance;
    int getBalance() {
        return balance;
    }
}

class SavingAccount extends Account {
    private final String fullName;
    public SavingAccount (String fullName, int balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Owner - " + this.fullName + "The balance is **" + this.balance + "**";
    }
}