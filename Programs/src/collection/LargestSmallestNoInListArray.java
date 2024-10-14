package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestSmallestNoInListArray {

	public static void main(String[] args) {
		
//		List<Integer> intList = new ArrayList<>();
//		intList.add(1);
//		intList.add(2);
//		intList.add(3);
//		intList.add(4);
		
		int array[] = {12, 13, 1, 10, 34, 10};
		
        List<Integer> arrayList
            = Arrays.asList(5, 3, 15, 234, 114, 1540);
 
	    System.out.println(arrayLNum(array));
	    System.out.println(arraySNum(array));
	    System.out.println(listLNum(arrayList));
	    System.out.println(listSNum(arrayList));


	}
	
	public static int arrayLNum(int array[]) {
		
	     int max = array[0];
	     for(int i=0; i<array.length; i++)
	     {
	       if(max < array[i])
	       {
	          max = array[i];
	       }
	     }
	    return max;
	}
	
	public static int arraySNum(int array[]) {
		
	     int max = array[0];
	     for(int i=0; i<array.length; i++)
	     {
	       if(max > array[i])
	       {
	          max = array[i];
	       }
	     }
	    return max;
	}
	
	public static int listLNum(List<Integer> arrayList) {
		
        int minValue = Integer.MIN_VALUE;
 
        for (Integer integer : arrayList) {
            if (integer > minValue)
            	minValue = integer;
        }
        return minValue;
		
	}
	
	public static int listSNum(List<Integer> arrayList) {
		
       int maxValue = Integer.MAX_VALUE;

       for (Integer integer : arrayList) {
           if (integer < maxValue)
               maxValue = integer;
       }
       return maxValue;
		
	}


}
