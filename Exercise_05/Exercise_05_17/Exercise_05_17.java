package Exercise_05_17;

import java.util.Scanner;

public class Exercise_05_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer from 1 to 15: ");
		
		int num = input.nextInt();
		
		int counter = 0;
		int a=0;
		int k=2;
		
		while(counter<=num) {
			
			for(int i=0; i<num*2-k; i++)
				System.out.print(" ");
			
			for(int i=counter; i>=0; i--) {
				
				if(counter==num)
					continue;
				System.out.print(i+1+" ");
				
				
			}
			
			for(int i=1; i<=counter; i++) {
				
				if(counter==num)
					continue;
				System.out.print(i+1+" ");
				
				
			}
			
			System.out.println("");
			counter++;
			k+=2;
		}
	}

}
