package Exercise_03_30;

import java.util.Scanner;

public class Exercise_03_30 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	
			
		long totalMilliseconds = System.currentTimeMillis();
			
		long totalSeconds = totalMilliseconds/1000;
		
		long currentSecond = totalSeconds%60;
		
		long totalMinutes = totalSeconds/60;
		
		long currentMinute = totalMinutes%60;
		
		long totalHours = totalMinutes/60;
		
		long currentHour = totalHours%24;
		
		System.out.print("Enter the time zone offset to GMT: ");
		
		int offset = input.nextInt();
		
		String amPm = "AM";
		
		currentHour+=offset;

		if(currentHour<0)
			currentHour+=24;
		
		if(currentHour>13){
			currentHour-=12;
			amPm = "PM";
		}
			
		System.out.print("The current time is : " + currentHour+":"+currentMinute+":"+currentSecond +" "+amPm);
		
		
		
	}
}
