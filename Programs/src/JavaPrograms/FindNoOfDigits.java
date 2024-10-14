package JavaPrograms;

public class FindNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 1234;
		int count = 0;
		
		while(no > 0) {
			no = no/10;
			count++;
			
		}
		System.out.println(count);

	}

}
