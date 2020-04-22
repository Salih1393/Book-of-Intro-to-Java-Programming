package Exercise_05_09;

import java.util.Scanner;

public class Exercise_05_09 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");

		int numOfStd = input.nextInt();

		int counter = 0;
		int hScore = 0;
		int sechScore = 0;
		String bestStd="";
		String secondStd="";
		while(counter<numOfStd) {
		
			System.out.print("Enter name of the "+(counter+1)+". student: ");
			String name = input.next();
			
			System.out.print("Enter score of the "+(counter+1)+". student: ");
			int score = input.nextInt();
			
			if(score>=hScore) {
				hScore = score;
				bestStd = name;
				
			}
			else if(score>=sechScore) {
				sechScore = score;
				secondStd = name;
				
			}
			
			counter++;
		
		}
		
		System.out.println("\nThe highest score is "+hScore+ " and it belons to " +bestStd);
		System.out.println("The second highest score is "+sechScore+ " and it belons to " +secondStd);
	}
	
}