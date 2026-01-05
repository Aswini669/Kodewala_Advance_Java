package Day5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {

	public static void main(String[] args) {
		long count = Stream.of("A","B","C").collect(Collectors.counting());
		System.out.println("total number is: " + count);
	}
}
