package com.kodewala.encap.student;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student(100, "Nikhil", 35.32, "Eng");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getPercentage());
		System.out.println(student.getStream());
	}
}
