package com.streamapi.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Students {
	String name;
	int marks;

	public Students(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class FindSecondHishestNumber {

	public static void main(String[] args) {
		Students s1 = new Students("Soumya1", 56);
		Students s2 = new Students("Soumya2", 35);
		Students s3 = new Students("Soumya3", 97);
		Students s4 = new Students("Soumya4", 54);
		Students s5 = new Students("Soumya5", 47);

		HashMap<String, Integer> map = new HashMap<>();
		map.put(s1.name, s1.marks);
		map.put(s2.name, s2.marks);
		map.put(s3.name, s3.marks);
		map.put(s4.name, s4.marks);
		map.put(s5.name, s5.marks);

		// for print the second highest marks
		Integer outPut = map.values().stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		// for print the name
		String outPut1 = map.entrySet().stream().filter(m -> m.getValue().equals(outPut)).map(e -> e.getKey())
				.findFirst().get();

		Entry<String, Integer> out = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())) // sort by value
																								// descending
				.skip(1) // skip the highest one
				.findFirst().get();

//		System.out.println(outPut + " " + outPut1);
		
		System.out.println("second highest number: " + out);
	}
}
