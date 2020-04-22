package Exercise_05_05;

public class Exercise_05_05 {
	
	public static void main(String[] args) {
		
		System.out.println("Kilograms"+"  "+"Pounds"+"    "+"|"+"\t"+
							"Pounds"+" "+"Kilograms"
						);
	
			int i=1;
			int j=20;
			
			while(i<200) {
		
		System.out.printf( "%-11d%6.1f", i,(i*2.2));
		System.out.print("    "+"|"+"\t");
		System.out.printf("%-10d%6.2f\n", j,(j/2.2));
			
		
		i+=2;
		j+=5;
	
	}
	
	}
}
