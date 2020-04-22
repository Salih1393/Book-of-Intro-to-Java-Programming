package Exercise_05_03;

public class Exercise_05_03 {

	public static void main(String[] args) {
	
			System.out.println("Kilograms\tPounds");
		
		int i=1;
		
		while(i<200) {
			
			System.out.printf( "%-16d%6.1f\n", i,(i*2.2));
			
			i+=2;
		}
	}
}
