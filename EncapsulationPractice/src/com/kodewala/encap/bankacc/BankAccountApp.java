package com.kodewala.encap.bankacc;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(2000);
		
		account.deposite(300);
		account.withdraw(100);
		System.out.println("Final Balance: " + account.getBalance());
	}
}
