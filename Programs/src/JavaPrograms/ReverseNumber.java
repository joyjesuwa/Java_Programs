package JavaPrograms;

public class ReverseNumber {
	
    static int reverse(int n) 
    { 
        // reversed number 
        int rev = 0; 
        // remainder 
        int rem; 
  
        while (n > 0) { 
            rem = n % 10; 
            rev = (rev * 10) + rem;  // 0+4=4 ; 40+3=43; 
            n = n / 10; 
        } 
  
        return rev; 
    } 
  
 
    public static void main(String[] args) 
    { 
        int n = 4526; 
  
        System.out.print("Reversed Number is "
                         + reverse(n)); 
    } 

}
