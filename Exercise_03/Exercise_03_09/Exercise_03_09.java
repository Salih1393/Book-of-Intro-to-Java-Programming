package Exercise_03_09;

import java.util.Scanner;

public class Exercise_03_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		int num = sc.nextInt();
		
		int d9 = num%10;
		num/=10;
		int d8 = num%10;
		num/=10;
		int d7 = num%10;
		num/=10;
		int d6 = num%10;
		num/=10;
		int d5 = num%10;
		num/=10;
		int d4 = num%10;
		num/=10;
		int d3 = num%10;
		num/=10;
		int d2 = num%10;
		num/=10;
		int d1 = num%10;
		num/=10;
		
		int checkSum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		
		if(checkSum==10)
			System.out.println("The ISBN-10 number is "+d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X");
		else
			System.out.println("The ISBN-10 number is "+d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+checkSum);
	}
}
