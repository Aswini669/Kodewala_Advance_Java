package Day5;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetExample {

	public static void main(String[] args) {
		Set<String> set = Stream.of("A","B","C").collect(Collectors.toSet());
		System.out.println(set);
	}
}
