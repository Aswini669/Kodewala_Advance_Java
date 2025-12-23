package Day1;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abinash","Nikhil","Soumya Deep","Yogesh","Dipankar");
		
		list.stream().map(b -> b.toUpperCase()).forEach(System.out::println);
	}
}
