package Exercise_05_41;

import java.util.Scanner;

public class Exercise_05_41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		int num = sc.nextInt(); 
		int max = 0;
		int count=1;
		
		if(num>max)
			max=num;
		
		while(num!=0) {
			
			num = sc.nextInt();
			
			if(num>max) {
				max=num;
				count=1;
			}
			else if(num == max)
				count++;
		}
		System.out.println("The largest number is "+max);
		System.out.println("The occurrence count of the largest number is "+count);
	}
}
