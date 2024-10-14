package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		int[] array = {5,6,4,2,3};
		Arrays.sort(array);
		for(Integer no : array) {
			System.out.println(no);
		}
		System.out.println("\n");
		
		for(int i=0; i<array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int tmp = 0;
				if (array[i] < array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
			System.out.println(array[i]);  

		}
		
		List<Integer> num = new ArrayList<>();
		num.addAll(Arrays.asList(3,5,2,4,1));
		
		Collections.sort(num);
		System.out.println(num);
		
		System.out.println(num.indexOf(5));
		
		Collections.reverse(num);
		System.out.println(num);


	}
	 

}
