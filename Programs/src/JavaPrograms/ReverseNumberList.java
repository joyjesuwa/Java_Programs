package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class ReverseNumberList {
	
//	// Function to reverse the number 
//    static int reverse(List<Integer> list) 
//    { 
//    	   // reversed number 
//        int rev = 0; 
//        // remainder 
//        int rem; 
//        
//        for(int i = 0; i < list.size(); i++) {
//        	
//        	int n = list.get(i);
//        	
//        	  while (n > 0) { 
//                  rem = n % 10; 
//                  rev = (rev * 10) + rem; 
//                  n = n / 10; 
//              } 
//        
//              return rev; 
//        }
//    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(100, 350, 225, 543, 677, 1234);
		
	    // reversed number 
        int rev = 0; 
        // remainder 
        int rem; 
        
        for(int i = 0; i < list.size(); i++) {
        	
        	int n = list.get(i);
        	
        	  while (n > 0) { 
                  rem = n % 10; 
                  rev = (rev * 10) + rem; 
                  n = n / 10; 
              } 
        
             // return rev; 
        	  System.out.println(rev);
        }

	}

}
