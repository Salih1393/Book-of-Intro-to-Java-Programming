package Exercise_05_23;

public class Exercise_05_23 {

	public static void main(String[] args) {
		
		double sum = 0;
		double n=1;
		
		for(int i=0; i<50000; i++) {
				
				sum += (1/n); 
			
				n++;
		}		
		n--;
		System.out.println("Left to rigth calculation: "+sum);
		
		for(int i=0; i<50000; i++) {
			
			sum += (1/n); 
		
			n--;
	}		
	
		System.out.println("Right to left calculation: "+sum);
	}
}
