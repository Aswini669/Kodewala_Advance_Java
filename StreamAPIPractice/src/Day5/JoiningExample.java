package Day5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

	public static void main(String[] args) {
		String joined = Stream.of("kodewala","Banglore").collect(Collectors.joining(","));
		System.out.println("total string is: " + joined);
	}
}
