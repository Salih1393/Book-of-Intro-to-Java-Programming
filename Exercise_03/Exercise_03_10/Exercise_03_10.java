package Exercise_03_10;

import java.util.Scanner;

public class Exercise_03_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number1 < number2) {
		
			int temp = number1;
			number1 = number2;
			number2 = temp;
			}
		
		System.out.print
		("What is " + number1 + " - " + number2 + "? ");
		
		int answer = sc.nextInt();
		
		if (number1 - number2 == answer)
		
			System.out.println("You are correct!");
			else {
				System.out.println("Your answer is wrong.");
				System.out.println(number1 + " - " + number2 +
						" should be " + (number1 - number2));
		
			}
		
			int number11 = (int)(Math.random() * 100);
			int number22 = (int)(Math.random() * 100);
				
			if(number11<number22) {
				int temp = number11;
				number11=number22;
				number22=temp;				
			}
				
		System.out.print
			("What is " + number11 + " - " + number22 + "? ");
				
			int answer2 = sc.nextInt();
				
			if (number11 - number22 == answer2)
				
				System.out.println("You are correct!");
				else {
				System.out.println("Your answer is wrong.");
				System.out.println(number11 + " - " + number22 +
							" should be " + (number11 - number22));
				
			
				}		
			}
}