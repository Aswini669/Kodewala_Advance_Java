package com.kodewala.encap.atm;

public class ATM {

	private double balance = 100;
	private String pin = "1122";
	
	//withdraw 
	public void withdraw(double amountToWithdraw, String enterPin)
	{
		System.out.println("current balance: " + balance);
		if(enterPin.equals(pin) && amountToWithdraw<=balance)
		{
			balance = balance - amountToWithdraw;
			System.out.println("Withdraw Balance: " + balance);
		}
		else
		{
			System.out.println("Error: incorrect PIN or Insufficient balance");
		}
	}
	
	public void deposit(double amount,String enterPin) 
	{
		if(enterPin.equals(pin))
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("Error: Incorrect PIN");
		}
		
	}
}
