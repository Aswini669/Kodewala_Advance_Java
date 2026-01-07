package com.learn.connection;

public class Database {

	String dbName, user, password;
	
	public Database() {
		this("mydb","root","admin123");
	}
	
	Database(String dbName,String user,String password)
	{
		this.dbName = dbName;
		this.user = user;
		this.password = password;
	}
	
	void connect()
	{
		System.out.println("connecting to DB: " + dbName + "as" + user);
	}
}
