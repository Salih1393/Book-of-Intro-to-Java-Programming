package Exercise_02_11;

import java.util.*;

public class Exercise_02_11 {

	public static void main(String [] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		
		int year = input.nextInt();
		
		double birth = year*365*24*60*60/7;
		double death = year*365*24*60*60/13;
		double immigrantion = year*365*24*60*60/45;
		
		System.out.println (312032486+birth+immigrantion-death);
		
	}
}
