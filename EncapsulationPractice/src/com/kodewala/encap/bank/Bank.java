package com.kodewala.encap.bank;

public class Bank {

	private int accNum = 500;
	private int pin = 3366;
	
	public void setData(int x,int y) {
		if(x > 0) {
			accNum = x;
			pin = y;
		}
		else {
			System.out.println("wrong data");
		}
	}
	
	public String getData() {
		return accNum + " " + pin;
	}
}
