package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleByNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> outPut = numbers.stream().filter(n -> n%2 == 0).map(m -> m*10).collect(Collectors.toList());
		System.out.println(outPut);
	}
}
