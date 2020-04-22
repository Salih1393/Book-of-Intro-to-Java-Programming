package Exercise_05_08;

import java.util.Scanner;

public class Exercise_05_08 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");

		int numOfStd = input.nextInt();

		int counter = 0;
		int hScore = 0;
		String bestStd="";
		while(counter<numOfStd) {
		
			System.out.print("Enter name of the "+(counter+1)+". student: ");
			String name = input.next();
			
			System.out.print("Enter score of the "+(counter+1)+". student: ");
			int score = input.nextInt();
			
			if(score>=hScore) {
				hScore = score;
				bestStd = name;
			}
			
			counter++;
		
		}
		
		System.out.println("The highest score is "+hScore+ " and it belons to " +bestStd);
	}
	
}
