package com.kodewala.encap.home;

public class Lock {

	private int lockNum = 7788;
	private int pin = 1234;
	
	public void setData(int x,int y) {
		if(x > 0) {
			lockNum = x;
		}
		else {
			System.out.println("wrong data");
		}
	}
	
	public String getData() {
		return lockNum + " " + pin;
	}
}
