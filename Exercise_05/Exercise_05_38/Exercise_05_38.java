package Exercise_05_38;

import java.util.Scanner;

public class Exercise_05_38 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Decimal number: ");
		int num = sc.nextInt();
		int octal = 0;
		int length=num;
		
		int i = 0;
		while(num>=1) {
			
			octal+=(num%8)*Math.pow(10, i);
			num/=8;
			i++;
		}
		
		System.out.println("Octal corresponding: "+octal);
	}


}
