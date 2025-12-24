package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringByLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amla","Or","Papya","Chiku","Appe","Graps");
		
		List<String> outPut = list.stream().filter(l -> l.length()>4).collect(Collectors.toList());
		System.out.println(outPut);
	}
}
