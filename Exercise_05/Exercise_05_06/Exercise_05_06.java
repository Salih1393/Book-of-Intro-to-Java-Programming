package Exercise_05_06;

public class Exercise_05_06 {
	
	public static void main(String[] args) {
		
		System.out.println("Miles"+"  "+"Kilometers"+"    "+"|"+"\t"+
							"Kilometers"+"  "+"Miles"
						);
	
			int i=1;
			int j=20;
			
			while(i<11) {
		
		System.out.printf( "%-6d%6.3f", i,(i*1.609));
		System.out.print("\t     "+"|"+"\t");
		System.out.printf("%-12d%6.3f\n", j,(j/1.609));
			
		
		i++;
		j+=5;
	
	}
	
	}

}
