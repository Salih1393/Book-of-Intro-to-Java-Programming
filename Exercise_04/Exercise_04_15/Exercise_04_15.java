package Exercise_04_15;

import java.util.Scanner;

public class Exercise_04_15 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		
		String s = sc.nextLine();
	
		if(s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C"))
			System.out.println("The corresponding number is 2");
		else if(s.equalsIgnoreCase("D") || s.equalsIgnoreCase("E") || s.equalsIgnoreCase("F"))
			System.out.println("The corresponding number is 3");
		else if(s.equalsIgnoreCase("G") || s.equalsIgnoreCase("H") || s.equalsIgnoreCase("I"))
			System.out.println("The corresponding number is 4");
		else if(s.equalsIgnoreCase("J") || s.equalsIgnoreCase("K") || s.equalsIgnoreCase("L"))
			System.out.println("The corresponding number is 5");
		else if(s.equalsIgnoreCase("M") || s.equalsIgnoreCase("N") || s.equalsIgnoreCase("O"))
			System.out.println("The corresponding number is 6");
		else if(s.equalsIgnoreCase("P") || s.equalsIgnoreCase("Q") || s.equalsIgnoreCase("R") || s.equalsIgnoreCase("S"))
			System.out.println("The corresponding number is 7");
		else if(s.equalsIgnoreCase("T") || s.equalsIgnoreCase("U") || s.equalsIgnoreCase("V"))
			System.out.println("The corresponding number is 8");
		else if(s.equalsIgnoreCase("W") || s.equalsIgnoreCase("X") || s.equalsIgnoreCase("Y")|| s.equalsIgnoreCase("Z"))
			System.out.println("The corresponding number is 9");
		else
			System.out.println(s+" is an invalid input");
		
	}	
}
