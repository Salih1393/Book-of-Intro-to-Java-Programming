package Exercise_04_18;

import java.util.Scanner;

public class Exercise_04_18 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		
		String s = sc.next();
		
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		
		String major = " ";
		
		if((""+c1).equalsIgnoreCase("M"))
			major = "Mathematics";
		else if((""+c1).equalsIgnoreCase("C"))
			major = "Computer Science";
		else if((""+c1).equalsIgnoreCase("I"))
			major = "information Technology";
		else {
			System.out.println("Invalid input");
			return;
		}
			
		
		String student = " ";
		
		if(c2=='1')
			student = "Freshman";
		else if(c2=='2')
			student = "Sophomore";
		else if(c2=='3')
			student = "Junior";
		else if(c2=='4')
			student = "Senior";
		else {
			System.out.println("Invalid input");
			return;
		}
		
		System.out.println(major+" "+student);
		
	}	
}
