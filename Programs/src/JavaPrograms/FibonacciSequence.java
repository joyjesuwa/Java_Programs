package JavaPrograms;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0, second = 1;
		
		int count = 8;
		
		System.out.print("Fibonacci Sequence : ");
		
		for(int i = 0; i < count; i++) {
			
			System.out.print(first +" ");
			
			int third = first + second;
			
			first = second;
			
			second = third;
			
		}
		
	}

}
