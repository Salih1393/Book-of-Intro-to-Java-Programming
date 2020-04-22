package Exercise_05_15;

public class Exercise_05_15 {
	
	public static void main(String[] args) {
	
		int i;
		int counter = 0;
		

		for(i=33; i<=126; i++) {
		
				System.out.print((char)(i)+" ");
				counter++;
				
				if(counter==10) {
					System.out.println("");
					counter=0;
				}
				
		}

	}	
}
