package Exercise_04_20;

import java.util.Scanner;

public class Exercise_04_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String s = sc.nextLine();
		
		System.out.println("Length of " + s + " is "+ s.length()+" and first character is "+ s.charAt(0));
		
	}
}
