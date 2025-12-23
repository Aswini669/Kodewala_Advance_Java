package Day1;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hii","Java","Ho","Kodewala");
		
		List<String> outPut = list.stream().filter(m -> m.length()>2).toList();
		System.out.println(outPut);
	}
}
