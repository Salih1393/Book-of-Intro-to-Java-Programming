package Exercise_05_28;

import java.util.Scanner;

public class Exercise_05_28 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		System.out.print("Enter the first day of the year: ");
		int firstDay = sc.nextInt();
		System.out.println();
		String firstDayinStr="";
		String monthinStr="";
		int month=1;
		
		for(int i=1;i<=12;i++) {			
			
			switch(firstDay) {
				case 1: firstDayinStr="Monday";
				break;
				case 2: firstDayinStr="Tuesday";
				break;
				case 3: firstDayinStr="Wednesday";
				break;
				case 4: firstDayinStr="Thursday";
				break;
				case 5: firstDayinStr="Friday";
				break;
				case 6: firstDayinStr="Saturday";
				break;
				case 0: firstDayinStr="Sunday";
				break;
				default:
					break;
		}
			
			switch (month) {
				case 1:	monthinStr="January";			
					break;
				case 2:	monthinStr="February";			
					break;
				case 3:	monthinStr="March";			
					break;
				case 4:	monthinStr="April";			
					break;
				case 5:	monthinStr="May";			
					break;
				case 6:	monthinStr="June";			
					break;
				case 7:	monthinStr="July";			
					break;
				case 8:	monthinStr="August";			
					break;
				case 9:	monthinStr="September";			
					break;
				case 10:monthinStr="October";				
					break;
				case 11:monthinStr="November";				
					break;
				case 12:monthinStr="December";				
					break;
				default:
					break;
			}
		
			System.out.println(monthinStr+" 1, "+year+" is "+firstDayinStr);
					
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				firstDay+=3;
			
			else if(month==2 && year%4==0)
				firstDay+=1;
			
			else if(month==4||month==6||month==9||month==11)
				firstDay+=2;
			
			month++;
			firstDay%=7;
		}		
	}
}
