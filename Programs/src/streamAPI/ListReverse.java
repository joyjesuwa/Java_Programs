package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str= Arrays.asList("Joy", "Jesuwa", "Jacob", "Mithun", "Nivi");
		
		str.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		

	}

}
