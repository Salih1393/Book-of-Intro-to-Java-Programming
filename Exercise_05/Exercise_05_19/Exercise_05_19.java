package Exercise_05_19;

public class Exercise_05_19 {

	public static void main(String[] args) {
		
		
		int k=1;
		
		for(int i=0; i<8; i++ ) {
			
			for(int j=0; j<14-i*2 ;j++) {
				
				System.out.print("  ");
			}
			
			
			for(int j=0; j<=i; j++) {

				if(k>=0 && k<10)
					System.out.print("   "+k);
				else if(k>=10 && k<=64)
					System.out.print("  "+k);
				else if(k>64)
					System.out.print(" "+k);
				k+=k;
			}
			
			
			k/=2;
			for(int j=0; j<i; j++) {
				
				k/=2;

				if(k>=0 && k<10)
					System.out.print("   "+k);
				else if(k>=10 && k<=64)
					System.out.print("  "+k);
				else if(k>64)
					System.out.print(" "+k);
			}
			k=1;
			System.out.println("");
		}
		
	}
}
