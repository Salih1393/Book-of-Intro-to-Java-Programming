package Exercise_02_03;

import java.util.*;

public class Exercise_02_03 {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");

		float feet = input.nextFloat();
		
		System.out.println(feet + " feet is " + feet*0.305 + " meters");
	}
}
