package com.learn.student;

public class Student {

	int id;
	String name;
	String branch;
	int yop;
	double per;
	
	public Student(int id,String name,String branch,int yop,double per) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.yop = yop;
		this.per = per;
	}
	
	void study() {
		System.out.println(name + " is studying");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	
}
