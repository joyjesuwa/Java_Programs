package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ascending Order
		List<Integer> ascendingList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		ascendingList.stream().sorted().forEach(System.out::println);

		/* Or can also try below way */
//       Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

		// Decending Order

		List<Integer> decendingList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> result = decendingList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);
		// .forEach(System.out::println);

	}

}
