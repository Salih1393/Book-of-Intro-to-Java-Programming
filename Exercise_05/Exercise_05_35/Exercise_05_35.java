package Exercise_05_35;

public class Exercise_05_35 {
	
	public static void main(String[] args) {
	
		double sum = 0;
		
		for(double i=1; i<625; i++) {
			
			sum+= (1/((Math.pow(i, 0.5))+(Math.sqrt(i+1))));
						
		}
		
		System.out.println(sum);
	}
}
