package Day2;

import java.util.Arrays;
import java.util.List;

public class PeekExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("skncknd","jjdbdk","djvnkd");
		
		list.stream().map(i -> i.toUpperCase()).peek(n -> System.out.println("peeking string: " + n)).forEach(System.out::println);
	}
}
