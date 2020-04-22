package Exercise_01_11;

public class Exercise_01_11 {

	public static void main(String [] args) {
		
		double birth = 5*365*24*60*60/7;
		double death = 5*365*24*60*60/13;
		double immigrantion = 5*365*24*60*60/45;
		
		System.out.println((312032486+birth+immigrantion-death)/1000000);
		
	}
}
