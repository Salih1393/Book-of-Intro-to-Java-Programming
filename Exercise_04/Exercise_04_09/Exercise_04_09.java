package Exercise_04_09;

import java.util.Scanner;

public class Exercise_04_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		
		String ch = sc.nextLine();
		
		char c = ch.charAt(0);		
		
		System.out.println((int)c);
		
		
	}
}
