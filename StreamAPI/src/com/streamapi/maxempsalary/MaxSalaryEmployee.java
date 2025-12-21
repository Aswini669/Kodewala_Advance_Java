package com.streamapi.maxempsalary;

import java.util.Arrays;
import java.util.List;

public class MaxSalaryEmployee {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Aman", 25000),
				new Employee("Sumit", 30000),
				new Employee("Maityr", 45000),
				new Employee("Rohit", 40000));
		
		double maxSalary = employees.stream()
				.mapToDouble(e -> e.getSalary())
				.max()
				.getAsDouble();
		System.out.println(maxSalary);
	}
}
