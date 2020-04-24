package Exercise_05_34;

import java.util.Scanner;

public class Exercise_05_34 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int winOfUser = 0;
		int winOfComp = 0;
		
		do{
		int num = (int)(Math.random()*3);
		
		System.out.print("Scissor (0), rock (1) or paper (2): ");
		
		int guess = input.nextInt();
		
		if(num == 0 && guess == 0)
			System.out.println("The computer is scissor. You are scissor, too. It is a draw.");
		else if(num == 1 && guess == 1)
			System.out.println("The computer is rock. You are rock, too. It is a draw.");
		else if(num == 2 && guess == 2)
			System.out.println("The computer is paper. You are paper, too. It is a draw.");
		
		
		else if(num == 0 && guess == 1) {
			System.out.println("The computer is scissor. You are rock. You win.");
			winOfUser++;
		}
		else if(num == 1 && guess == 2) {
			System.out.println("The computer is rock. You are paper. You win.");
			winOfUser++;
		}
		else if(num == 2 && guess == 0) {
			System.out.println("The computer is paper. You are scissor. You win.");
			winOfUser++;
		}
		
		else if(num == 0 && guess == 2) {
			System.out.println("The computer is scissor. You are paper. Computer wn.");
			winOfComp++;
		}
		else if(num == 1 && guess == 0) {
			System.out.println("The computer is rock. You are scissor. Computer win.");
			winOfComp++;
		}
		else if(num == 2 && guess == 1) {
			System.out.println("The computer is paper. You are rock. Computer win.");
		winOfComp++;
		}
		
		else {
			System.out.println("Wrong number!");
				return;
			}
		System.out.println("Computer:"+winOfComp+" You:"+winOfUser+"\n");
		}
		while(Math.abs(winOfComp-winOfUser)<3);		
		
	}
}
