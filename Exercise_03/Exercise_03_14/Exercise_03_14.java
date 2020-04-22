package Exercise_03_14;

import java.util.Scanner;

public class Exercise_03_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coin = (int)(Math.random()*2);
		
		System.out.print("Guess the flip of the coin result as integers 0 for head, 1 for tail: ");
		
		int guess = sc.nextInt();
		
		if(coin == guess)
			System.out.println("Correct answer!");
		else
			System.out.println("Wrong answer!");
	}
	
}
