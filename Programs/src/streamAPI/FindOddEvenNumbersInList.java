package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOddEvenNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		System.out.print("Even Numbers : ");
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
		
		List<Integer> list1 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		System.out.print("Odd Numbers : ");
		list1.stream().filter(n -> n % 2 != 0).forEach(System.out::print);

		/* or can also try below method */

//		Map<Boolean, List<Integer>> list1 = Arrays.stream(Int[]).boxed()
//				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
//		System.out.println(list1);

	}

}
