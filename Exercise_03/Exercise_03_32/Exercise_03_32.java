package Exercise_03_32;

import java.util.Scanner;

public class Exercise_03_32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three points for p0, p1, and p2: ");
		
		double x0 = sc.nextDouble();
		double y0 = sc.nextDouble();
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double sum = ((x1-x0)*(y2-y0)-(x2-x0)*(y1-y0));
		
		if(sum>0)
			System.out.println("("+x2+", "+y2+") is on the left side of the line from ("+x0+", "+y0+") to ("+x1+", "+y1+")");
		
		else if(sum==0)
			System.out.println("("+x2+", "+y2+") is on the line from ("+x0+", "+y0+") to ("+x1+", "+y1+")");
		
		else
			System.out.println("("+x2+", "+y2+") is on the right side of the line from ("+x0+", "+y0+") to ("+x1+", "+y1+")");
		
	}
}
