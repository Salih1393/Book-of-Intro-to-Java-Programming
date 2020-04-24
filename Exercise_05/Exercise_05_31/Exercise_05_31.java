package Exercise_05_31;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise_05_31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getInstance();
		formatter.setMaximumFractionDigits(2);
		formatter.setGroupingUsed(false);
		
		System.out.print("Enter the initial deposit amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double annualInterest = sc.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		int months = sc.nextInt();
		
		double monthlyInterest = annualInterest/1200;
		
		System.out.println("Month\t"+"CD Value");
		for(int i=0; i<months; i++) {
			
			amount+= amount*monthlyInterest;
			System.out.println(i+1+"\t"+formatter.format(amount));
		}
		
		
	}



}
