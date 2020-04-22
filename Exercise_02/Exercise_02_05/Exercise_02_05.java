package Exercise_02_05;

import java.util.*;

public class Exercise_02_05 {

	public static void main(String [] args) {
		
	System.out.print("Enter the subtotal and a gratuity rate: ");
	
	Scanner input = new Scanner(System.in);
	
	double subtotal = input.nextDouble();
	double gratuity_rate = input.nextDouble();
	
	double gratuity = subtotal/100*gratuity_rate;
			
	System.out.print("The gratuity is $"+ gratuity +  " and total is $" + (gratuity+subtotal));
	
	
		
			 
	}	
}
