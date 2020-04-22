package Exercise_02_10;

import java.util.*;

public class Exercise_02_10 {

public static void main(String [] args) {
	
		//Q = M * (finalTemperature – initialTemperature) * 4184
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in Kilograms: ");
		double kg = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double temp1= input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double temp2= input.nextDouble();
		
		System.out.print("The energy needed is "+ kg*(temp2-temp1)*4184);

	}	
}
