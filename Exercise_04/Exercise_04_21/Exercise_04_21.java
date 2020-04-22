package Exercise_04_21;

import java.util.Scanner;

public class Exercise_04_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		
		String s = sc.next();
		
		if(s.charAt(3) == '-' && s.charAt(6) == '-' && s.length()==11)
			System.out.println(s+ " is a valid social security number");
		
		else
			System.out.println(s+ " is an invalid social security number");
			
	}
}
