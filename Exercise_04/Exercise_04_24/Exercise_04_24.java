package Exercise_04_24;

import java.util.Scanner;

public class Exercise_04_24 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String firstCity = sc.nextLine();
		
		System.out.print("Enter the second city: ");
		String secondCity = sc.nextLine();
		
		System.out.print("Enter the third city: ");
		String thirdCity = sc.nextLine();
		
		
		int firstComparison = firstCity.compareToIgnoreCase(secondCity);
		int secondComparison = secondCity.compareToIgnoreCase(thirdCity);
		int thirdComparison = firstCity.compareToIgnoreCase(thirdCity);
		
		if(firstComparison<0 && secondComparison<0)
			System.out.println("The three cities in alphabetical order are "+ firstCity +" "+secondCity +" "+thirdCity);
		
		else if(firstComparison<0 && secondComparison>0)
			if(thirdComparison<0)
				System.out.println("The three cities in alphabetical order are "+ firstCity +" "+thirdCity +" "+secondCity);
			else
				System.out.println("The three cities in alphabetical order are "+ thirdCity +" "+firstCity +" "+secondCity);
		
		else if(firstComparison>0 && secondComparison<0)
			if(thirdComparison>0)
				System.out.println("The three cities in alphabetical order are "+ secondCity +" "+thirdCity +" "+firstCity);
			else
				System.out.println("The three cities in alphabetical order are "+ secondCity +" "+firstCity +" "+thirdCity);
		
		else
			System.out.println("The three cities in alphabetical order are "+ thirdCity +" "+secondCity +" "+firstCity);
			
		
	}
}
