package Exercise_02_14;

import java.util.*;

public class Exercise_02_14 {

	public static void main(String[]args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight in pounds: ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = sc.nextDouble();
		
		System.out.print("BMI is " + (weight*0.45359237)/((height*0.0254)*(height*0.0254)));
	}	
}
