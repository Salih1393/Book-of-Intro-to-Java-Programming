package Exercise_05_04;

public class Exercise_05_04 {

	public static void main(String[] args) {
		
		System.out.println("Miles\tKilometers");
		
		int i=1;
		
		while(i<11) {
			
			System.out.printf( "%-7d%6.3f\n", i,(i*1.609));
			
			i++;
		}
	}
}
