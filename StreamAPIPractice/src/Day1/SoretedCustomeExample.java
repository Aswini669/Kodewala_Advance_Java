package Day1;

import java.util.Arrays;
import java.util.List;

public class SoretedCustomeExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kodewwla","Academy","Banglore","Abinash");
		
		list.stream().sorted((a,b) -> a.length() - b.length()).forEach(System.out::println);
	}
}
