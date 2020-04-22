package Exercise_03_21;

import java.util.Scanner;

public class Exercise_03_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2012): ");		
		int year = sc.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int month = sc.nextInt();
		if(month == 1) {
			month=13;
			year--;}
		if(month == 2) {
			month=14;
			year--;}
		
		System.out.print("Enter the day of the month:");
		int q = sc.nextInt();
		
		int j = year/100;
		
		int k = year%100;
		
		int h = (q + (26*(month+1)/10) + k + (k/4) + (j/4) + (5*j))%7;
		
		switch (h) {
		case 0:
			System.out.println("Day of the week is Saturday");
			break;
		case 1:
			System.out.println("Day of the week is Sunday");
			break;
		case 2:
			System.out.println("Day of the week is Monday");
			break;
		case 3:
			System.out.println("Day of the week is Tuesday");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday");
			break;
		case 5:
			System.out.println("Day of the week is Thursday");
			break;
		case 6:
			System.out.println("Day of the week is Friday");
			break;

		default:
			break;
		}
		
	}
}
