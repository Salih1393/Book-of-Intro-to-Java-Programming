package Exercise_05_29;

import java.util.Scanner;

public class Exercise_05_29 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		System.out.print("Enter the first day of the year: ");
		int firstDay = sc.nextInt();
		
		System.out.println();
		
		String firstDaySpace="";
		String monthinStr="";
		
		int month=1;
		int numOfDays=31;
		
		for(int i=1;i<=12;i++) {			
			
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
				switch(firstDay) {
				case 1: firstDaySpace="\t";
				break;
				case 2: firstDaySpace="\t\t";
				break;
				case 3: firstDaySpace="\t\t\t";
				break;
				case 4: firstDaySpace="\t\t\t\t";
				break;
				case 5: firstDaySpace="\t\t\t\t\t";
				break;
				case 6: firstDaySpace="\t\t\t\t\t\t";
				break;
				case 0: firstDaySpace="";
				break;
				default:firstDaySpace="";
					break;
			}
				
			System.out.println("\n\t\t"+monthinStr+" "+year+
					"\n______________________________________________________"+
					"\nSun\tMon\tTue\tWed\tThu\tFri\tSat");
			
			int nextLine = 7-firstDay+1;
			nextLine%=7;
			boolean flag=true;
						
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				numOfDays=31;			
			else if(month==2 && year%4==0)
				numOfDays=29;
			else if(month==4||month==6||month==9||month==11) 
				numOfDays=30;
			else 
				numOfDays=28;
			
			for(int j=1;j<=numOfDays;j++) {
				
				if(j%7==nextLine)
					System.out.println();
				
				if(flag==true) {
					System.out.print(firstDaySpace+j+"\t");
						flag=false;
				}
				else
					System.out.print(j+"\t");
								
				}
				
				
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				firstDay+=3;
			
			else if(month==2 && year%4==0) 
				firstDay+=1;
			
			else if(month==4||month==6||month==9||month==11) 
				firstDay+=2;
			
			
			month++;
			firstDay%=7;
			
			System.out.println();
		}		
	
	
		
		
	}
}
