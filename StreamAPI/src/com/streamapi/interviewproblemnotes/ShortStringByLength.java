package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortStringByLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("banana","apple","kiwi","grape","pineapple","orange");
		
		words.stream().sorted(Comparator.comparingInt(w -> w.length())).forEach(System.out::println);
		
	}
}
