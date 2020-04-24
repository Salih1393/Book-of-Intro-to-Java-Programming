package Exercise_05_32;

import java.util.Scanner;

public class Exercise_05_32 {
	public static void main(String[] args) {
	
		int lottery = (int)(Math.random()*100);
		
		int firstDigit = lottery%10;
		int secondDigit = lottery/10;
		
		while(firstDigit==secondDigit) {
			
			lottery = (int)(Math.random()*100);
			
			 firstDigit = lottery%10;
			 secondDigit = lottery/10;
			 
		}
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your lottery pick (two digits): ");
		
		int guess = sc.nextInt();
		
		int firstDigitofGuess = guess%10;
		int secondDigitoGuess = guess/10;
		
		System.out.println("Lottery number is: "+lottery);
		if(lottery==guess)
			System.out.println("Exact match: you win $10,000");
		else if(firstDigit==secondDigitoGuess && secondDigit==firstDigitofGuess)
			System.out.println("Match all digits: you win $3,000");
		else if(firstDigit==firstDigitofGuess 
			 || firstDigit==secondDigitoGuess
			 || secondDigit==firstDigitofGuess
			 || secondDigit==secondDigitoGuess)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}
