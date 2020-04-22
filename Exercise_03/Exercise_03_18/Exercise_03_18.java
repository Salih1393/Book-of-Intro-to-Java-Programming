package Exercise_03_18;

import java.util.Scanner;

public class Exercise_03_18 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the weight of the package: ");
	
	int weight = sc.nextInt();
	
	if(weight>50) {
		System.out.println("The package cannot be shipped.");
		return;}
	
	if(0 < weight && weight <= 1)
		System.out.println("Shipping cost is $3.5");
	
	else if(weight <= 3)
		System.out.println("Shipping cost is $5.5");
	
	else if(weight <= 10)
		System.out.println("Shipping cost is $8.5");
	
	else
		System.out.println("Shipping cost is $10.5");
	}
}
