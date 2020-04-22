package Exercise_05_20;

public class Exercise_05_20 {

	public static void main(String[] args) {

		int i;
		int counter = 0;
		boolean flag = true;

		for(i=2; i<=1000; i++) {
			for (int j=2; j<i; j++) {
				if (i % j == 0)
					flag = false;

			}

			if (flag==true) {
				System.out.print(i + " ");
				counter++;
			}

			if(counter==8) {
				System.out.println("");
				counter=0;
			}

			flag=true;

		}

	}
}
