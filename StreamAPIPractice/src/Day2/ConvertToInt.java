package Day2;

import java.util.Arrays;
import java.util.List;

public class ConvertToInt {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","10","100","1000");
		
		list.stream().mapToInt(v -> Integer.parseInt(v)).forEach(System.out::println);
	}
}
