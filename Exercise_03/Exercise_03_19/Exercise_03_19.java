package Exercise_03_19;

import java.util.Scanner;

public class Exercise_03_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the edges of the triangle: ");
		
		double edge1 = sc.nextDouble();
		double edge2 = sc.nextDouble();
		double edge3 = sc.nextDouble();
		
		if(edge1+edge2<edge3
		|| edge2+edge3<edge1
		|| edge3+edge1<edge2)
			System.out.println("Inputs are invalid!");
		
		else
			System.out.println("The perimeter of the triangle is " + (edge1+edge2+edge3));
	}
	
}
