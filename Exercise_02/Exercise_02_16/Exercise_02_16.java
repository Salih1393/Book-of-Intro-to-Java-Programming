package Exercise_02_16;

import java.util.Scanner;

public class Exercise_02_16 {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		
		double side = sc.nextDouble();
		
		double result = Math.pow(side, 2)*3*Math.pow(3, 0.5)/2;
				
		System.out.println("The area of the hexagon is "+ result);
		
	}	
}
