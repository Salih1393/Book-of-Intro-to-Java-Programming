package Exercise_05_42;

import java.util.Scanner;

public class Exercise_05_42 {
	public static void main(String[] args) {
		
		int salesAmount=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your goal of the commission that you want to earn: ");
		int remainedCom = sc.nextInt();
		int a = remainedCom;
		
		for(; remainedCom>0 ;) {
			
			if(salesAmount<5000) {
				salesAmount+=5000;
				remainedCom-=(5000*8)/100;
			}
			
			else if(salesAmount>=5000 && salesAmount <10000) {
				salesAmount+=5000;
				remainedCom-=(5000*10)/100;
			}
			
			else {				
				salesAmount+=remainedCom*100/12;	
				remainedCom=0;
			}
		}
		
		System.out.println("Minimum sales to earn "+a+ ": "+salesAmount);
		
	}


}
