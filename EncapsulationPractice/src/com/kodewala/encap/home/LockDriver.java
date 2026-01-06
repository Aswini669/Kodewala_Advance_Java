package com.kodewala.encap.home;

public class LockDriver {

	public static void main(String[] args) {
		Lock lock = new Lock();
		
		lock.setData(-54612, 7896);
		System.out.println(lock.getData());
	}
}
