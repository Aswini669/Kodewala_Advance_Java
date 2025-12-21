package com.streamapi.secondhighest;

import java.util.Comparator;
import java.util.HashMap;

class Employe{
	String name;
	double salary;
	
	public Employe(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
}

public class SecondHighestSalary {

	public static void main(String[] args) {
		HashMap<String, Double> empMap = new HashMap<String, Double>();
		empMap.put("Gyana", 50000.0);
        empMap.put("Aswini", 60000.0);
        empMap.put("Soumya", 55000.0);
        empMap.put("Nikhil", 80000.0);
        empMap.put("Yogesh", 70000.0);
        
        Double outPut = empMap.values().stream()
        		.distinct()
        		.sorted(Comparator.reverseOrder())
        		.skip(1)
        		.findFirst()
        		.get();
		
		System.out.println("second highest salary: "+ outPut);
		
		
	}
}
