package Exercise_03_12;

import java.util.Scanner;

public class Exercise_03_12 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		
		int num = sc.nextInt();
		
		int a = num;
		
		int d1 = num % 10;
		num/=10;
		int d2 = num % 10;
		num/=10;
		int d3 = num;
		
		int numP = d1*100+d2*10+d3;
		
		if(a==numP)
			System.out.println(a + " is a palindrome");
		else
			System.out.println(a + " is not a palindrome");
	}	
}
