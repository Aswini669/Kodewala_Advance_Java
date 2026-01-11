package Day6;

import java.util.List;

public class PeakExample {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		list.stream().peek(n -> System.out.println("before filter: " + n))
		.filter(l -> l%2 == 0)
		.peek(m -> System.out.println("After filter: "+ m))
		.map(p -> p*10)
		.peek(u -> System.out.println("After Map: " + u))
		.forEach(System.out::println);
		
	}
}
