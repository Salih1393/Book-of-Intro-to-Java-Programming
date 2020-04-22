package Exercise_03_25;

import java.util.Scanner;

public class Exercise_03_25 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
	
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double x4 = sc.nextDouble();
		double y4 = sc.nextDouble();
		
		double a = y1-y2;
		double b = -1* (x1-x2);
		double c = y3-y4;
		double d = -1* (x3-x4);
		double e = a*x1 - (y1*(x1-x2));
		double f = c*x3 - (y3*(x3-x4));
		
		if(a*d-b*c == 0) {
			System.out.println("The two lines are parallel.");
			return;}
		
		double x = ((e*d)-(b*f)) / ((a*d)-(b*c));
		double y = ((a*f)-(e*c)) / ((a*d)-(b*c));
		
		System.out.print("The intersecting point is at (" + x +","+y+")" );
		
	}
}
