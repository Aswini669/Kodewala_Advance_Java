package com.streamapi.flatmapuserquestions;

import java.util.Arrays;
import java.util.List;

public class UserPhones {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("Aman", Arrays.asList("111-1111","222-35235")), 
				new User("Suman", Arrays.asList("2255-336644")),
				new User("Manas", Arrays.asList("4444-55222","336655-225")));
		
		List<String> outPut = users.stream().flatMap(u -> u.getPhoneNumber().stream()).toList();
		
		System.out.println(outPut);
	}
}
