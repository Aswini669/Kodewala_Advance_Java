package com.kodewala.encap.atm;

public class ATMApp {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		atm.deposit(50, "1122");
		atm.withdraw(100, "1122");
	}
}
