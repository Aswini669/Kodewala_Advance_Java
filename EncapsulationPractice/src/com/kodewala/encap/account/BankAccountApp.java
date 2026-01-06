package com.kodewala.encap.account;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
		account.addMoney(600);
		account.withdraw(100);
		System.out.println("Final balance: " + account.getBalance());
	}
}
