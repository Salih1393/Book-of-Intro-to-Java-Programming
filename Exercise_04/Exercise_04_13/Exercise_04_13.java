package Exercise_04_13;

import java.util.Scanner;

public class Exercise_04_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		
		String s = sc.nextLine();
		
		char ch = s.charAt(0);
		
		if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			   ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
					System.out.println(ch+ " is a vowel");
			else
				System.out.println(ch+" is a consonant");
		
		else
			System.out.println(ch + " is an invalid input");
	}
}
