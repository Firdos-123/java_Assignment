package com.firdos.assignment6;

abstract class Account {
    private static int accountCounter = 0;
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(double initialBalance) {
        this.accountNumber = ++accountCounter;
        this.balance = initialBalance;
        Bank.incrementTotalAccounts(); // Increment total accounts when a new account is created
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Concrete method to get balance
    public double getBalance() {
        return this.balance;
    }

    // Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Protected method to set balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
