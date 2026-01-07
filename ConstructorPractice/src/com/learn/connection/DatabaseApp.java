package com.learn.connection;

public class DatabaseApp {

	public static void main(String[] args) {
		Database db1 = new Database();
		Database db2 = new Database("testDb", "admin", "pass123");
		
		db1.connect();
		db2.connect();
	}
}
