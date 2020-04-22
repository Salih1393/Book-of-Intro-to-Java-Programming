package Exercise_04_23;

import java.util.Scanner;

public class Exercise_04_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double workHr = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		System.out.println("\nEmployee Name: "+name);
		System.out.println("Hours Worked: "+workHr);
		System.out.println("Pay Rate: $"+payRate);
		System.out.println("Gross Pay: $"+workHr*payRate);
		System.out.println("Deductions: ");
		System.out.println(" Federal Withholding ("+fedTax+"%): $"+workHr*payRate*fedTax);
		System.out.println(" State Withholding ("+stateTax+"%): $"+workHr*payRate*stateTax);
		System.out.println(" Total Deduction: $"+((workHr*payRate*fedTax)+(workHr*payRate*stateTax)));
		System.out.println("Net Pay: $"+((workHr*payRate)-(workHr*payRate*fedTax+workHr*payRate*stateTax)));
		
	}
}
