package Exercise_03_03;

import java.util.Scanner;

public class Exercise_03_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double f=sc.nextDouble();
		
		if(a*d-b*c == 0)
			System.out.print("The equation has no solution.");		
		
		else {
		double x = (e*d-b*f)/(a*d-b*c);
		double y = (a*f-e*c)/(a*d-b*c);
		
		System.out.print("x is "+x+" and y is "+y);
		
		}
	}	
}
