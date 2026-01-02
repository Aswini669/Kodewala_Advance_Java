package com.kodewala.encap.bankacc;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance) 
	{
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//deposit amount
	public void deposite(int amount) {
		if(amount > 0)
		{
			balance += amount;
			System.out.println("deposited amount: " + amount);
		}
		else 
		{
			System.out.println("invalid amount");
		}
	}
	
	
	//withdraw amount
	public void withdraw(int amount) {
		if(amount>0 && amount<=balance) 
		{
			balance -= amount;
			System.out.println("debited amount: " + amount);
		}
		else
		{
			System.out.println("Insufficient funds or invalid amount");
		}
	}
}
