package Exercise_04_08;

import java.util.Scanner;

public class Exercise_04_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		
		int ascii = sc.nextInt();
		
		char code = (char)ascii;
		
		System.out.println("The character for ASCII code "+ ascii+" is "+ code);
	}
}
