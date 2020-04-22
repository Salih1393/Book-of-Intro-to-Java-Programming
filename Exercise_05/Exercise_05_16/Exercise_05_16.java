package Exercise_05_16;

import java.util.Scanner;

public class Exercise_05_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
	
		int num = input.nextInt();
		
		int divider = 2;
		
		while(divider<num) {
		
			if(num%divider==0) {
				System.out.print(divider+",");
				num/=divider;
				continue;
			}
			divider++;
		}		
		System.out.print(num+".");
	}
}
