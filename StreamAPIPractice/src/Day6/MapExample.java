package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kodewlw","Abinash","Nikhil","Aswini");
		List<String> outPut = list.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
		System.out.println(outPut);
	}
}
