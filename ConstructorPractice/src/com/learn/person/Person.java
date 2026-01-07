package com.learn.person;

public class Person {

	String name;
	int age;
	String gender;
	double height;
	
	void display() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
		System.out.println("heightt: " + height);
	}
	
	Person()
	{
		name = "Aman";
		age = 24;
		gender = "Male";
		height = 6;
	}
	
	Person(String name)
	{
		this.name = name;
		age = 43;
	}
	
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
		gender = "Female";
		height = 5.3;
	}
	
	Person(String name,int age,String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
