package Day5;

import java.util.Arrays;
import java.util.List;

public class SumofSquareNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		int sum = list.stream()
				.filter(n -> n%2 == 0)
				.mapToInt(n -> n*n)
				.sum();
		System.out.println("sum is: " + sum);
	}
}
