package com.streamapi.intermediateoperations;

import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		List<String> list = List.of("kodewala","Academy","Banglore","100% Placement");
		
		list.stream().skip(2).forEach(System.out::println);
	}
}
