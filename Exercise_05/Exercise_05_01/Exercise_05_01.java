package Exercise_05_01;

import java.util.Scanner;

public class Exercise_05_01 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter integers, the input ends if it is 0: ");
		
		int num = sc.nextInt();
		double sum = 0;
		
		int pCounter = 0;
		int nCounter = 0;
		
		while(num!=0) {
			
			if(num>0)
				pCounter++;
			
			else if(num<0)
				nCounter++;
				
			sum+=num;
			num = sc.nextInt();
			
		}
		
		if(num==0) {
			System.out.println("No numbers are entered except 0");
			return;
			
		}
		
		System.out.println("The number of positives is "+pCounter);
		System.out.println("The number of negatives is "+nCounter);
		System.out.println("The total is "+sum);
		System.out.println("The average is "+ (sum/(pCounter+nCounter)));
	}
}
