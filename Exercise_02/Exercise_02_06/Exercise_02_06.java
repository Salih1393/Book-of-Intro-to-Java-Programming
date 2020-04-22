package Exercise_02_06;

import java.util.*;

public class Exercise_02_06 {

	public static void main(String []args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		
		int num = input.nextInt();
		
		int num1 = num%10;
		
		num/=10;
		
		int num2 = num%10;
		
		num/=10;
		
		int num3 = num%10;
		
		System.out.print("The sum of the digits is: " + (num1+num2+num3));
		
	}	
}
