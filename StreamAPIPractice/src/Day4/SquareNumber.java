package Day4;

import java.util.List;
import java.util.stream.Stream;

public class SquareNumber {

	public static void main(String[] args) {
		Stream<Integer> list = Stream.of(1,2,3,4,5,6,7,8,9);
		List<Integer> outPut = list.map(n -> n*n).toList();
		System.out.println("square of number is : " + outPut);
	}
}
