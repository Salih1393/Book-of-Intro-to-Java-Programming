package Exercise_05_37;

import java.util.Scanner;

public class Exercise_05_37 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Decimal number: ");
		int num = sc.nextInt();
		int binary = 0;
		int length=num;
		
		int i = 0;
		while(num>=1) {
			
			binary+=(num%2)*Math.pow(10, i);
			num/=2;
			i++;
		}
		
		System.out.println("Binary corresponding: "+binary);
	}
}
