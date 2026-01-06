package com.kodewala.encap.wallet;

public class PaymentWallet {

	private double balance = 10000;
	
	public double getBalance() {
		System.out.println("your total balance is: " + balance);
		return balance;
	}
	
	//add money
	public void addmoney(double amount)
	{
		if(amount > 0)
		{
			this.balance += amount;
			System.out.println("your deposited balance is: " + amount);
		}
	}
	
	//withdraw money
	public void makePayment(double amount)
	{
		if(amount>0 && amount<this.balance)
		{
			this.balance -= amount;
			System.out.println("your balance is; " + amount);
		}
	}
}
