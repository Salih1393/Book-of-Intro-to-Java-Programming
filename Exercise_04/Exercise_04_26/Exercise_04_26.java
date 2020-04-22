package Exercise_04_26;

import java.util.Scanner;

public class Exercise_04_26 {
	
	public static void main(String[] args) {	

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for example 11.56: ");
	
		String amount = input.nextLine();
	
		String numberOfOneDollars = amount.substring(0,(int)(amount.indexOf('.')));
	
		int numOfDollars = Integer.parseInt(numberOfOneDollars);
	
		String remAmount = amount.substring((int)(amount.indexOf('.')+1),amount.length());
	
		int remainingAmount = Integer.parseInt(remAmount);
	
		int numberOfQuarters = remainingAmount / 25;
			remainingAmount = remainingAmount % 25;
	
		int numberOfDimes = remainingAmount / 10;
			remainingAmount = remainingAmount % 10;
	
		int numberOfNickels = remainingAmount / 5;
			remainingAmount = remainingAmount % 5;
	
		int numberOfPennies = remainingAmount;	
	 
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(numberOfOneDollars + " dollars ");
		System.out.println(numberOfQuarters + " quarters ");
		System.out.println(numberOfDimes + " dimes ");
		System.out.println(numberOfNickels + " nickels ");
		System.out.println(numberOfPennies + " pennies");
		
	}
}
