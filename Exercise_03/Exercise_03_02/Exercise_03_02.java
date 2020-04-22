package Exercise_03_02;

import java.util.Scanner;

public class Exercise_03_02 {
	public static void main(String[] args) {

	int number1 = (int)(System.currentTimeMillis() % 10);
	int number2 = (int)(System.currentTimeMillis() / 3 % 10);
	int number3 = (int)(System.currentTimeMillis() / 7 % 10);


	Scanner input = new Scanner(System.in);

	System.out.print(
			"What is " + number1 + " + " + number2 + " + " + number3 + "? ");

	int number = input.nextInt();

	System.out.println(
			number1 + " + " + number2 + " + " + number3 + " = " + number + " is " +
					(number1 + number2 + number3 == number));
	}
}