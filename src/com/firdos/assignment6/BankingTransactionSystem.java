package com.firdos.assignment6;

public class BankingTransactionSystem {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savings = new SavingsAccount(500.0, 0.03);
        savings.deposit(100.0);
        savings.withdraw(50.0);
        savings.addInterest();
        System.out.println("Savings Account Balance: ₹" + savings.getBalance());

        // Create a CheckingAccount
        CheckingAccount checking = new CheckingAccount(300.0, 200.0);
        checking.deposit(150.0);
        checking.withdraw(500.0);
        System.out.println("Checking Account Balance: ₹" + checking.getBalance());

        // Create a Transaction instance with a fixed transaction fee
        Transaction transaction = new Transaction(2.0);
        transaction.performTransaction(savings, 50.0, false); // Withdraw from savings
        transaction.performTransaction(checking, 100.0, true); // Deposit to checking

        // Display the total number of accounts
        System.out.println("Total Number of Accounts: " + Bank.getTotalAccounts());
    }
}
