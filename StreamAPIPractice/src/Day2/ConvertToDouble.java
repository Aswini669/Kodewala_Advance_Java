package Day2;

import java.util.Arrays;
import java.util.List;

public class ConvertToDouble {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("112","145","16.35","12.5");
		list.stream().mapToDouble(n -> Double.parseDouble(n)).forEach(System.out::println);
		
	}
}
