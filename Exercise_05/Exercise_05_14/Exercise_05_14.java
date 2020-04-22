package Exercise_05_14;

import java.util.Scanner;

public class Exercise_05_14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		
		int gcd=Math.min(n1, n2);
		
		int counter=0;
		while(counter<Math.min(n1, n2)){
			
			if(n1%gcd==0 && n2%gcd==0) {
				
				System.out.println("The greatest common divisor is "+gcd);
					return;
				}
			gcd--;
			
			counter++;
		}
		
		
	}

}
