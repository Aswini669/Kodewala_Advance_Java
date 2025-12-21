package com.streamapi.employeenamejoins;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeName {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Ayush"), new Employee("Amit"), new Employee("Asus"),
				new Employee("Charlie"), new Employee("Acer"));
		
		String outPut = employees.stream()
				.map(e -> e.getName())
				.collect(Collectors.joining(",  "));
		System.out.println(outPut);
	}
}
