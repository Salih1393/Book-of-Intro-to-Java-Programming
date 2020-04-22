package Exercise_02_20;

import java.util.*;

public class Exercise_02_20{
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = sc.nextDouble();
		double annualRate = sc.nextDouble();
		
		System.out.print("The interest is " + balance*annualRate/1200);
		
	}	
}