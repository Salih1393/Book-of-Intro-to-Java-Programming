package Exercise_05_30;

import java.text.NumberFormat;
import java.util.Scanner;


public class Exercise_05_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getInstance();
		formatter.setMaximumFractionDigits(3);
		formatter.setGroupingUsed(false);
		
		System.out.print("Enter the amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Enter the annual interest: ");
		double annualInterest = sc.nextDouble();
		
		System.out.print("Enter the number of months: ");
		int months = sc.nextInt();
		
		double monthlyInterest = annualInterest/1200;
		
		double sum = 0;
		for(int i=0; i<months; i++) {
			
			sum= (amount+sum)*(1+monthlyInterest);
		}
		
		System.out.println(formatter.format(sum));
	}

}
