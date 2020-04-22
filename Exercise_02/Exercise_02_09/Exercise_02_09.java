package Exercise_02_09;

import java.util.*;

public class Exercise_02_09 {
	
	public static void main(String[]args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter v0, v1 and t: ");
		
	float v0=input.nextFloat();
	float v1=input.nextFloat();
	float t=input.nextFloat();
	
	System.out.println("The average acceleration is "+ (v1-v0)/t);
	
	}
}
