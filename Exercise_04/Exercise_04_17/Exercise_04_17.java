package Exercise_04_17;

import java.util.Scanner;

public class Exercise_04_17 {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		
		int year = sc.nextInt();
		
		System.out.print("Enter a month: ");
		
		String month = sc.next();
		
		
		if(month.equalsIgnoreCase("Jan") || month.equalsIgnoreCase("Mar") || month.equalsIgnoreCase("May")
		||month.equalsIgnoreCase("Jul") ||month.equalsIgnoreCase("Aug") ||month.equalsIgnoreCase("Oct")
		||month.equalsIgnoreCase("Dec"))
			
				System.out.println(month + " "+ year+ " has 31 days");
		
		else if(month.equalsIgnoreCase("Apr") || month.equalsIgnoreCase("Jun")
				||month.equalsIgnoreCase("Sep") ||month.equalsIgnoreCase("Nov"))
			
						System.out.println(month + " "+ year+ " has 30 days");
			
		else if(month.equalsIgnoreCase("Feb"))
			if(year%4 == 0)
				System.out.println(month + " "+ year+ " has 29 days");
			else
				System.out.println(month + " "+ year+ " has 28 days");
		
		
	}

}
