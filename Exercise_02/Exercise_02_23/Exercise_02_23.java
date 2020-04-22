package Exercise_02_23;

import java.util.*;

public class Exercise_02_23 {
	
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		
		double dist = sc.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		
		double mpg = sc.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		
		double ppg = sc.nextDouble();
		
		System.out.println("The cost of driving is $"+ dist*ppg/mpg);
		
	}
}
