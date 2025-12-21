package com.streamapi.secondhighest;

import java.util.Comparator;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Gyana", 50000);
		Employee emp2 = new Employee(11, "Aswini", 60000);
		Employee emp3 = new Employee(12, "Soumya", 55000);
		Employee emp4 = new Employee(16, "Nikhil", 60000);
		Employee emp5 = new Employee(15, "Yogesh", 45000);

		HashMap<Integer, HashMap<String, Double>> map = new HashMap<Integer, HashMap<String, Double>>();

		HashMap<String, Double> e1 = new HashMap<String, Double>();
		e1.put(emp1.name, emp1.salary);
		e1.put(emp2.name, emp2.salary);
		e1.put(emp3.name, emp3.salary);
		e1.put(emp4.name, emp4.salary);
		e1.put(emp5.name, emp5.salary);
		
		
		map.put(emp1.id, e1);
		map.put(emp2.id, e1);
		map.put(emp3.id, e1);
		map.put(emp4.id, e1);
		map.put(emp5.id, e1);
		
		Double highest = map.values().stream().flatMap(n->n.values().stream()).distinct()
		.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("second highest salary: " + highest);
		

	}
}
