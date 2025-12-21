package com.streamapi.classproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class Employee{
//	String name;
//	double salary;
//	
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public double getSalary() {
//		return salary;
//	}
//	
//	
//}

public class SencondHighestSalary {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(231000,35354,1000,43563,689879);
		
		Integer outPut = list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println("your 2nd highest salary is: " + outPut);
	}
}
