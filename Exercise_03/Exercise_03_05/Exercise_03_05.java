package Exercise_03_05;

import java.util.Scanner;

public class Exercise_03_05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter today's day: ");
		
		int todaysDay = sc.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		
		int futureDay = sc.nextInt();
		
		futureDay%=7;
		futureDay+=todaysDay;
		
		switch (todaysDay) {
		case 0:			
			System.out.print("Today is Sunday and ");
				break;
		case 1:			
			System.out.print("Today is Monday and ");
				break;
		case 2:			
			System.out.print("Today is Tuesday and ");
				break;
		case 3:			
			System.out.print("Today is Wednesday and ");
				break;
		case 4:			
			System.out.print("Today is Thursday and ");
				break;
		case 5:			
			System.out.print("Today is Friday and ");
				break;
		case 6:			
			System.out.print("Today is Saturday and ");
				break;
				
		default:
			System.out.print("Wrong number!");
				break;
		}
		
		switch (futureDay) {
		case 0:			
			System.out.println("the future day is Sunday");
				break;
		case 1:			
			System.out.println("the future day is Monday");
				break;
		case 2:			
			System.out.println("the future day is Tuesday");
				break;
		case 3:			
			System.out.println("the future day is Wednesday");
				break;
		case 4:			
			System.out.println("the future day is Thursday");
				break;
		case 5:			
			System.out.println("the future day is Friday");
				break;
		case 6:			
			System.out.println("the future day is Saturday");
				break;
				
		default:
			System.out.println("Wrong number!");
				break;
		}
		
		
		
		
		
		
	}	
}
