package Exercise_05_22;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise_05_22 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		NumberFormat nf = NumberFormat.getInstance(); 
		nf.setMaximumFractionDigits(2); 
		nf.setGroupingUsed(false);
		
		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();
		
		System.out.print("Number of Years: ");		
		double loanPeriod = sc.nextDouble();
		
		System.out.print("Annual Interest Rate: ");	
		double annualInterestRate = sc.nextDouble();
		System.out.println();
		
		double monthlyInterestRate = annualInterestRate/1200;
		
		double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/(Math.pow(1+monthlyInterestRate , loanPeriod*12))));
	
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for(int i=1; i<=loanPeriod*12; i++) {
		
			double interest = monthlyInterestRate*loanAmount;
			double principal = monthlyPayment-interest;
			loanAmount-=principal;
			
			System.out.println(i+"\t\t"+nf.format(interest)+"\t\t"+nf.format(principal)+"\t\t"+nf.format(loanAmount));
			
	
		}
	}
}
