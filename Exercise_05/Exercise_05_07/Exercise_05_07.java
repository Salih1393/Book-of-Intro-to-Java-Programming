package Exercise_05_07;

public class Exercise_05_07 {

	public static void main(String[] args) {
		
		double tuition = 10000;
		
		int counter = 0;
		
		while(counter<10) {
			
			tuition+=((tuition/100)*5);
			counter++;		
			
		}
		
		System.out.printf("After 10 years tuition will be $%5.2f\n",tuition);
		
		double cost = 0;
		for(int i=0;i<4;i++) {
			
			tuition+=((tuition/100)*5);
			cost+=tuition;
			
		}
		
		System.out.printf("The tuition for 4 years will be $%5.2f",cost);
	}
}
