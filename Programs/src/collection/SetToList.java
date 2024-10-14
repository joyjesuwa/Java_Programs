package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToList {

	public static void main(String[] args) {
		
		Set<String> weather = new HashSet<>();
		weather.add("Hot");
		weather.add("Cold");
		weather.add("Hot");
		
		List<String> weatherList = weather.stream().collect(Collectors.toList());
		System.out.println(weatherList);


	}

}
