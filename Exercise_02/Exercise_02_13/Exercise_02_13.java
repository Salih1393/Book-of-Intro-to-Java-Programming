package Exercise_02_13;

import java.util.*;

public class Exercise_02_13 {

	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
		
		double sum = 0;
		
		System.out.print("Enter the montly saving amount: ");
		
		double amount = input.nextDouble();
		
		sum = (sum+amount)*(1+0.00417);
		sum = (sum+amount)*(1+0.00417);
		sum = (sum+amount)*(1+0.00417);
		sum = (sum+amount)*(1+0.00417);
		sum = (sum+amount)*(1+0.00417);
		sum = (sum+amount)*(1+0.00417);
		
		System.out.println("After the sixth month, the account value is $"+ sum);
		
		
	}	
}
