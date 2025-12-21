package com.streamapi.practice;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class FindEvenOdd {

	public static void main(String[] args) {
		
		Student s1 = new Student(100, "Aman", 20000);
		Student s2 = new Student(101, "Aman2", 20001);
		Student s3 = new Student(102, "Aman1", 20002);
		Student s4 = new Student(103, "Muna", 20003);
		Student s5 = new Student(104, "Suman", 20005);
		Student s6 = new Student(105, "Rakesh", 20006);
		
		HashMap<Integer, HashMap<String, Double>> map = new HashMap<Integer, HashMap<String,Double>>();
		
		HashMap<String, Double> st1 = new HashMap<String, Double>();
		HashMap<String, Double> st2 = new HashMap<String, Double>();
		HashMap<String, Double> st3 = new HashMap<String, Double>();
		HashMap<String, Double> st4 = new HashMap<String, Double>();
		HashMap<String, Double> st5 = new HashMap<String, Double>();
		HashMap<String, Double> st6 = new HashMap<String, Double>();
		
		st1.put(s1.name, s1.marks);
		st2.put(s2.name, s2.marks);
		st3.put(s3.name, s3.marks);
		st4.put(s4.name, s4.marks);
		st5.put(s5.name, s5.marks);
		st6.put(s6.name, s6.marks);
		
		map.put(s1.id, st1);
		map.put(s2.id, st1);
		map.put(s3.id, st1);
		map.put(s4.id, st1);
		map.put(s5.id, st1);
		map.put(s6.id, st1);
		
		List<Double> outPut = map.keySet()
				.stream()
				.filter(n -> n%2==0)
				.flatMap(m -> map.get(m).values().stream())
				.collect(Collectors.toList());
		
		System.out.println(outPut);
	}
}
