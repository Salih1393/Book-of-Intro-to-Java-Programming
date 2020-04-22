package Exercise_05_21;

import java.util.Scanner;

public class Exercise_05_21 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();
		
		System.out.print("Number of Years: ");		
		double loanPeriod = sc.nextDouble();
		
		double annualInterestRate = 5.000;
		System.out.println("Interest Rate\tMonthly Payment\t\tTotal Payment\n");
		while(annualInterestRate<=8.000) {
			
			double monthlyInterestRate = annualInterestRate/1200;
			double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/(Math.pow(1+monthlyInterestRate , loanPeriod*12))));
		
			System.out.println(annualInterestRate+"%\t\t"+monthlyPayment+"\t"+monthlyPayment*12*loanPeriod);
			
			annualInterestRate+=0.125;
			
		}
	}
}
