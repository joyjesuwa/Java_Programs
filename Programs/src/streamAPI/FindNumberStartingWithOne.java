package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartingWithOne {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 15, 30, 17, 50);
		
		//EX:1

		List<String> obj = list.stream().map(x -> x.toString()).filter(x -> x.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(obj);
		
		//Ex:2

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "") // Convert integer to String
				.filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
