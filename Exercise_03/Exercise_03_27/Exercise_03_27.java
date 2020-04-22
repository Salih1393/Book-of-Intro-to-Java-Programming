package Exercise_03_27;

import java.util.Scanner;
public class Exercise_03_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		
		double x = sc.nextDouble();
		
		double y = sc.nextDouble();
				
		double a0 = Math.abs((x*0+0*0+200*y-(y*0+0*200+0*x))/2.0);
		double a1 = Math.abs((x*100+0*0+200*y-(y*0+100*200+0*x))/2.0);
		double a2 = Math.abs((x*100+0*0+0*y-(y*0+100*0+0*x))/2.0);
		
		if((100*200/2.0) == (a0+a1+a2))
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}
}
