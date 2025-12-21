package com.streamapi.flatmapempsalary;

import java.util.Arrays;
import java.util.List;

public class FilterEmployees {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Aman", 29000), new Employee("Suman", 39000),
				new Employee("Rohit", 69000), new Employee("Soumya", 89000));
		
		List<Employee> outPut = employees.stream()
				.filter(e -> e.getSalary()>50000)
				.toList();
		
		System.out.println(outPut);
	}
}
