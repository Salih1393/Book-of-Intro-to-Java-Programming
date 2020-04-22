package Exercise_03_26;

import java.util.Scanner;

public class Exercise_03_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int num = sc.nextInt();
		
		System.out.println("Is " + num + " divisible by 5 and 6? "
				+ ((num%5 == 0 && num%6 == 0)?true:false));
		
		System.out.println("Is " + num + " divisible by 5 or 6? "
				+ ((num%5 == 0 || num%6 == 0)?true:false));
		
		System.out.println("Is " + num + " divisible by 5 and 6, but not both? "
				+ ((num%5 == 0 ^ num%6 == 0)?true:false));
	}
}
