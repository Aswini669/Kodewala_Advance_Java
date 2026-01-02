package com.kodewala.encap.bank;

public class BankApp {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.setData(-100, 4455);
		System.out.println(b.getData());
	}
}
