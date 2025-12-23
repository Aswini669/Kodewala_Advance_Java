package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekExsmple {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","xyz");
		
		Stream<String> peeked = list.stream().peek(p -> System.out.println("peeking: " + p));
		
		peeked.forEach(s -> System.out.print("Final: " + s));
	}

}
