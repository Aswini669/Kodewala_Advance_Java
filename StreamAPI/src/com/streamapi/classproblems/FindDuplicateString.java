package com.streamapi.classproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aman","Dipankar","Soumya","Aman","Aswini","Trisha","Aswini");
		
		//this creates a set to store numbers already seen while checking for duplicates.
		HashSet<String> set = new HashSet<String>();
		
		List<String> duplicateName = list.stream().filter(n -> !set.add(n)).toList();
		System.out.println(duplicateName);
	}
}
