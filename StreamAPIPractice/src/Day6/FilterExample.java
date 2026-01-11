package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hi","From","Kodewala","BTM 2nd stage");
	    List<String> outPut = list.stream().filter(n -> n.length()>3).collect(Collectors.toList());
	    System.out.println(outPut);
	}
}
