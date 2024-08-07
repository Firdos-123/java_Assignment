package com.firdos.assignment6;

public class Transaction {

	private final double transactionFee;
	
	public Transaction(double transactionFee) {
		this.transactionFee= transactionFee;
	}
	
	public final void performTransaction(Account account,double amount,boolean isDeposit) {
		if (isDeposit) {
			account.deposit(amount);
		}
		else {
			account.withdraw(amount);
		}
	    System.out.println("Transaction Fee: ₹" + transactionFee);
	}
	
	

}
