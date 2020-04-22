package Exercise_02_12;

import java.util.*;

public class Exercise_02_12 {

	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter speed and acceleration: ");
		
		double speed = input.nextDouble();
		double acc = input.nextDouble();
		
		System.out.print("The minimum runway length for this airplane is "+ speed*speed/(2*acc));
	}	
}
