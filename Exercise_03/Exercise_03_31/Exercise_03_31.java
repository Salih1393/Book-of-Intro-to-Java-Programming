package Exercise_03_31;

import java.util.Scanner;

public class Exercise_03_31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		
		double exRate = sc.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		
		int con = sc.nextInt();
		
		double amount = 0;
		
		if(con == 0) {
			System.out.print("Enter the dollar amount: ");
			amount = sc.nextDouble();
			System.out.println("$"+amount + " is "+amount*exRate+ " yuan");
		}
		
		else if (con == 1) {
			System.out.print("Enter the RMB amount: ");
			amount = sc.nextDouble();
			System.out.println(amount + " yuan is $"+amount/exRate);
		}
		
		else {
			System.out.println("Incorrect input");
			return;
		}
		
	}
}
