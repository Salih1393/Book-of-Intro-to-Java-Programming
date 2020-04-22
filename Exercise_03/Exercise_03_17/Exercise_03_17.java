package Exercise_03_17;

import java.util.Scanner;

public class Exercise_03_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = (int)(Math.random()*3);
		
		System.out.print("Scissor (0), rock (1) or paper (2): ");
		
		int guess = input.nextInt();
		
		if(num == 0 && guess == 0)
			System.out.println("The computer is scissor. You are scissor, too. It is a draw.");
		else if(num == 1 && guess == 1)
			System.out.println("The computer is rock. You are rock, too. It is a draw.");
		else if(num == 2 && guess == 2)
			System.out.println("The computer is paper. You are paper, too. It is a draw.");
		
		
		else if(num == 0 && guess == 1)
			System.out.println("The computer is scissor. You are rock. You won.");
		else if(num == 1 && guess == 2)
			System.out.println("The computer is rock. You are paper. You won.");
		else if(num == 2 && guess == 0)
			System.out.println("The computer is paper. You are scissor. You won.");
		
		
		else if(num == 0 && guess == 2)
			System.out.println("The computer is scissor. You are paper. Computer won.");
		else if(num == 1 && guess == 0)
			System.out.println("The computer is rock. You are scissor. Computer won.");
		else if(num == 2 && guess == 1)
			System.out.println("The computer is paper. You are rock. Computer won.");
		
		else
			System.out.println("Wrong number!");
			return;
		
	}
	
}
