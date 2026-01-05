package Day5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListExample {

	public static void main(String[] args) {
		List<String> list = Stream.of("A","B","C").collect(Collectors.toList());
		System.out.println(list);
	}
}
