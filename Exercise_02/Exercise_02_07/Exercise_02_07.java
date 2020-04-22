package Exercise_02_07;

import java.util.*;

public class Exercise_02_07 {
	
	public static void main(String []args) {
	
	System.out.print("Enter the number of minutes: ");
		
	Scanner input = new Scanner (System.in);
	
	long mins = input.nextInt();
	
	long years = mins/60/24/365;
	
	long reminderDays = (mins/60/24)%365;
	
	System.out.print(mins + " minutes is approximately " + years + " years and " + reminderDays + " days");
		
	}
}
