package Exercise_03_28;

import java.util.Scanner;

public class Exercise_03_28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double width1 = sc.nextDouble();
		double height1 = sc.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double width2 = sc.nextDouble();
		double height2 = sc.nextDouble();
	
		
		if(x2-(width2/2)>=x1-(width1/2)
		&& x2+(width2/2)<=x1+(width1/2)
		&& y2-(height2/2)>=y1-(height1/2)
		&& y2+(height2/2)<=y1+(height1/2))
			System.out.println("r2 is inside r1");
		
		else if(x2-(width2/2)<=x1+(width1/2) || x2+(width2/2)>=x1+(width1/2)
			 && x2-(width2/2)<=x1-(width1/2) || x2+(width2/2)>=x1+(width1/2)
			 && y2-(height2/2)<=y1+(height1/2)||y2+(height2/2)<=y1+(height1/2)
			 && y2-(height2/2)<=y1+(height1/2)||y2+(height2/2)<=y1+(height1/2))
					System.out.println("r2 overlaps r1");
		
		else System.out.println("r2 does not overlap r1");			
	}
}
