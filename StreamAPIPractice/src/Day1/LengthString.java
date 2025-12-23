package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple","Mango","Chiku","Orange","Banana");
		
		List<Integer> outPut = list.stream().map(l -> l.length()).collect(Collectors.toList());
		System.out.println("length of the string is: " + outPut);
	}
}
