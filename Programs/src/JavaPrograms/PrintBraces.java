package JavaPrograms;

public class PrintBraces {
	
	void Braces() {
		
		char a = '{', b = '}';
		int count = 3;
		
		for(int i = 1; i <= count; i++) {
			
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= j; k++)
					System.out.print(a);
				for(int k = 1; k <= j; k++)
					System.out.print(b);
				System.out.print(" ");
			}	
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintBraces pb = new PrintBraces();
		pb.Braces();

	}

}
