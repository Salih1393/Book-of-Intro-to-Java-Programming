package Exercise_02_21;

import java.util.*;

public class Exercise_02_21 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double amount = sc.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualRate = sc.nextDouble();
		System.out.print("Enter number of years: ");
		double numOfYears = sc.nextDouble();
		
		double result = amount * Math.pow(1+(annualRate/1200),numOfYears*12);
		
		System.out.print("Accumulated value is $" + result);
	
		
		
	}
}
