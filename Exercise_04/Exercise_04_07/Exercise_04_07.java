package Exercise_04_07;

import java.util.Scanner;

public class Exercise_04_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		
		double radius = sc.nextDouble();
		
		double x0 = 0;
		double y0 = radius;
		
		double x1 = radius * Math.sin(Math.PI/5*2);
		double y1 = radius * Math.cos(Math.PI/5*2);
		
		double x2 = radius * Math.sin(Math.PI/5*2*2);
		double y2 = radius * Math.cos(Math.PI/5*2*2);
		
		double x3 = radius * Math.sin(Math.PI/5*2*3);
		double y3 = radius * Math.cos(Math.PI/5*2*3);
		
		double x4 = radius * Math.sin(Math.PI/5*2*4);
		double y4 = radius * Math.cos(Math.PI/5*2*4);
		
		System.out.println("The coordinates of five points on the pentagon are");		
		System.out.println("("+x0+", "+y0+")");
		System.out.println("("+x1+", "+y1+")");
		System.out.println("("+x2+", "+y2+")");
		System.out.println("("+x3+", "+y3+")");
		System.out.println("("+x4+", "+y4+")");
		
	}
}
