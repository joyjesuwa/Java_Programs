package strings;

public class ReverseSentence {

	public static void main(String[] args) {  //Today is Holiday
		// TODO Auto-generated method stub
		
		String s1 = "Today is Holiday";
		
		int start = 0, end = s1.length()-1;
		
		for(int i = s1.length()-1; i >= 0; i--) {
			
			if(s1.charAt(i) != ' ') {
				continue;
			}
			else {
				start = i+1;
				reverse(s1, start, end);
				end = i-1;
			}
		}

	}

	private static void reverse(String s1, int start, int end) {
		// TODO Auto-generated method stub
		
		String s2 = "";
		
		for(int i = 0; i <= end; i++) {
			s2 = s2 + s1.charAt(i);
		}
		s2 = s2 + " ";
		System.out.println(s2);
	}

}
