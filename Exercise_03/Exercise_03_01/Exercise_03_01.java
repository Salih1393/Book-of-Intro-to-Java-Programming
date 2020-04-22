package Exercise_03_01;

import java.util.Scanner;

public class Exercise_03_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a, b, c: ");
		
		double a = sc.nextDouble(); 
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double disc = Math.pow(b, 2)-4*a*c;
		double r1 = 0.0;
		double r2 = 0.0;
		
		if(disc>0) {
			r1= (-b + Math.pow(disc, 0.5))/2*a;
			r2= (-b - Math.pow(disc, 0.5))/2*a;
			
			System.out.println("The equation has two roots "+r1+ " and "+r2);
		}
		
		else if(disc==0) {
			r1= (-b + Math.pow(disc, 0.5))/2*a;
			
			System.out.println("The equation has one root "+r1);
		}
		else
			System.out.println("The equation has no real roots");
		
		
	}	
}
