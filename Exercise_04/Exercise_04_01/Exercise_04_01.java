package Exercise_04_01;

import java.util.Scanner;

public class Exercise_04_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length from the center to a vertex: ");
		
		double r = sc.nextDouble();
		
		double s = 2*r*Math.sin(Math.PI/5);
		
		System.out.printf("The area of the pentagon is %4.2f", 
				(5*Math.pow(s,2))/ (4*(Math.tan(Math.PI/5))));		
		
	}
}
