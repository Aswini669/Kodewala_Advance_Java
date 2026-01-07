package com.learn.person;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		
		Person p2 = new Person("Soumya");
		p2.display();
		
		Person p3 = new Person("Yogesh", 32);
		p3.display();
		
		Person p4 = new Person("Kasturi", 23, "Female");
		p4.display();
	}
}
