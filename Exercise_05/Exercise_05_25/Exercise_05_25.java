package Exercise_05_25;

public class Exercise_05_25 {
	public static void main(String[] args) {
		
		double pi=4;
		
		double sum = 0;
		for (double i = 1; i <= 10000; i++) {
			
			sum+=(Math.pow(-1, i+1)/(2*i-1));
			
		}		
		pi*=sum;
		System.out.println("Pi for i=10000:  "+pi);
		
		pi=4;
		
		sum = 0;
		for (double i = 1; i <= 20000; i++) {
			
			sum+=(Math.pow(-1, i+1)/(2*i-1));
			
		}		
		pi*=sum;
		System.out.println("Pi for i=20000:  "+pi);
		
		pi=4;
		
		sum = 0;
		for (double i = 1; i <= 100000; i++) {
			
			sum+=(Math.pow(-1, i+1)/(2*i-1));
			
		}
		
		pi*=sum;
		System.out.println("Pi for i=100000: "+pi);
	}
}
