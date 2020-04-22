package Exercise_03_15;

import java.util.Scanner;

public class Exercise_03_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	int lottery = (int)(Math.random() * 1000);
	
	int tempLot=lottery;
	System.out.print("Enter your lottery pick (three digits): ");

	int guess = sc.nextInt();
	if(guess>1000 || guess <100) {
		System.out.println("Try again and enter only 3 digits!");
		return;}
	int tempGu = guess;
	
	int lotteryDigit1 = tempLot / 100;
	tempLot%=100;
	int lotteryDigit2 = tempLot / 10;
	int lotteryDigit3 = tempLot % 10;
	
	int guessDigit1 = tempGu / 100;
	tempGu%=100;
	int guessDigit2 = tempGu / 10;
	int guessDigit3 = tempGu % 10;
	
	System.out.println("The lottery number is " + lottery);

	if (guess == lottery)	
		System.out.println("Exact match: you win $10,000");
	 
	else if (guessDigit1 == lotteryDigit1
			&& guessDigit2 == lotteryDigit3
			&& guessDigit3 == lotteryDigit2
			||
			guessDigit1 == lotteryDigit2
			&& guessDigit2 == lotteryDigit1
			&& guessDigit3 == lotteryDigit3
			||
			guessDigit1 == lotteryDigit3
			&& guessDigit2 == lotteryDigit2
			&& guessDigit3 == lotteryDigit1
			)
	 System.out.println("Match all digits: you win $3,000");
	
	else if (guessDigit1 == lotteryDigit1
	|| guessDigit1 == lotteryDigit2
	|| guessDigit1 == lotteryDigit3
	|| guessDigit2 == lotteryDigit1
	|| guessDigit2 == lotteryDigit2
	|| guessDigit2 == lotteryDigit3
	|| guessDigit3 == lotteryDigit1
	|| guessDigit3 == lotteryDigit2
	|| guessDigit3 == lotteryDigit3
	)
	System.out.println("Match one or two digit: you win $1,000");
	
	else
	System.out.println("Sorry, no match");
	
	}
}
