package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listStr = Arrays.asList("Joy", "Sanjeth", "Jerry", "Jacob", "Mithun", "Ashwell");
		
		Optional<String> longestString = listStr.stream().max(Comparator.comparingInt(String::length));
		
		System.out.println(longestString);

	}

}
