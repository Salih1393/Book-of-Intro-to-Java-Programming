package Exercise_05_36;

import java.util.Scanner;

public class Exercise_05_36 {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		int num = sc.nextInt();
		int temp = num;
		int checkSum =0;
		
		for(int i=9; i>=1; i--) {
			
			checkSum += (temp%10)*i;
			temp/=10;
		}
		checkSum%=11;
		
		if(checkSum==10 && temp ==0)
			System.out.println("The ISBN-10 number is 0"+num+"X");
		else if(checkSum==10 && temp !=0)
			System.out.println("The ISBN-10 number is "+num+"X");
		else if(checkSum!=10 && temp ==0)
			System.out.println("The ISBN-10 number is 0"+num+""+checkSum);
		else
			System.out.println("The ISBN-10 number is "+num+""+checkSum);
	}
}
