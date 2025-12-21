package com.streamapi.flatmapuserquestions;

import java.util.List;

public class User {

	String name;
	List<String> phoneNumber;
	
	public User(String name, List<String> phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
