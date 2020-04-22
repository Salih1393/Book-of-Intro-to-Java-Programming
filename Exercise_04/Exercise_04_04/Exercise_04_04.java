package Exercise_04_04;
import java.util.Scanner;

public class Exercise_04_04 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		
		double side = sc.nextDouble();
		
		double area = 6*Math.pow(side,2)/(4*Math.tan(Math.PI/6));
		
		System.out.print("The area of the hexagon is "+area);
		
	}
}
