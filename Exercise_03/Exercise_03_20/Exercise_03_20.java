package Exercise_03_20;

import java.util.Scanner;

public class Exercise_03_20 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		
		double ta = sc.nextDouble();
		
		if(!(ta>-58 && ta<41)) {
			System.out.println("Input is invalid!");
			return;}
			
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		
		double v = sc.nextDouble();
		
		if(!(v>=2)) {
			System.out.println("Input is invalid!");
			return;}
		
		double twc = 35.74 + 0.6215*ta - 35.75*Math.pow(v, 0.16) + 0.4275*ta*Math.pow(v, 0.16);

		System.out.print("The wind chill index is " + twc);
	}	
}
