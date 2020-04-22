package Exercise_04_11;

import java.util.Scanner;

public class Exercise_04_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		
		int value = input.nextInt();
		
		if(value>=0 && value<10)
			System.out.print("The hex value is "+ value);
		
		else if(value>=10 && value<16)
			System.out.println("The hex value is "+ (char)('A'-10+value));
		
		else
			System.out.println(value+" is an invalid input");
		
	}
}
