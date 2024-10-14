package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	
	public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream()
              .filter(n -> !set.add(n))
              .forEach(System.out::println);
}
	
	public static void getDataWithoutDuplicates1() {
	    List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	    myList.stream().distinct().forEach(noDuplicateData -> System.out.println(noDuplicateData));
	}


	//Or you can also use below 

	public static void getDataWithoutDuplicates2() {
	     List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	     Set<Integer> set = new HashSet<>(myList);
	       
	     // Convert the set back to a list if needed
	     List<Integer> uniqueData = set.stream().collect(Collectors.toList());
	       
	     // Print the unique elements
	     uniqueData.forEach(System.out::println);
	 }

	/* or can also try below single line code */
//	List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
	
	
}


