package com.kodewala.encap.account;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//deposite money
	public void addMoney(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("deposited amount: " + amount);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	//withdraw money
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("withdrawn money: " + amount);
		}
		else {
			System.out.println("insufficient fund");
		}
	}
}
