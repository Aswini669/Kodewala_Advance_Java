package com.streamapi.secondhighest;

import java.util.Comparator;
import java.util.HashMap;

class Student{
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public double getMarks() {
		return marks;
	}
}

public class SecondHighestMarks2 {

	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Soumya", 53);
		Student s2 = new Student(11, "Aman", 64);
		Student s3 = new Student(14, "Gyana", 56);
		Student s4 = new Student(15, "Nikhil", 30);
		Student s5 = new Student(13, "Aswini", 92);
		
		HashMap<Integer, HashMap<String, Double>> map = new HashMap<Integer, HashMap<String,Double>>();
		
		HashMap<String, Double> st = new HashMap<String, Double>();
		st.put(s1.name, s1.marks);
		st.put(s2.name, s2.marks);
		st.put(s3.name, s3.marks);
		st.put(s4.name, s5.marks);
		st.put(s5.name, s5.marks);
		
		map.put(s1.id, st);
		map.put(s2.id, st);
		map.put(s3.id, st);
		map.put(s4.id, st);
		map.put(s5.id, st);
		
		Double secondMarks = map.values().stream()
				.flatMap(n -> n.values().stream())
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println("second highestt marks: "+ secondMarks);
		
	}
}
