package com.kodewala.encap.linkedin;

public class LinkedInProfileApp {

	public static void main(String[] args) {
		LinkedInProfile linked = new LinkedInProfile();
		
		linked.setName("Aman Kumar");
		linked.setEmail("aman@gmail.com");
		linked.setJobTitle("ceo");
		
		System.out.println("your name:  " + linked.getName());
		System.out.println("email: " + linked.getEmail());
		System.out.println("job title: " + linked.getJobTitle());
	}
}
