package Exercise_05_18;

public class Exercise_05_18 {

	public static void main(String[] args) {
		
		
		System.out.println("Pattern A");
		
		for(int i=0; i<6; i++) {
			
				for(int j=0; j<=i; j++)
						System.out.print(j+1+" ");			
		
			System.out.println("");
		}
		
		System.out.println("\nPattern B");
		
		for(int i=0; i<6; i++) {
			
				for(int j=0; j<6-i; j++)
						System.out.print(j+1+" ");			
		
			System.out.println("");
		}
		
		System.out.println("\nPattern C");
		
		int k = 0;
		for(int i=0; i<6; i++) {
			
				for(int j=i; j<5; j++)
						System.out.print("  ");	
				
				
				for(int j=0; j<=i; j++) {
						k=i-j;
						System.out.print(k+1+" ");
				}
				
			System.out.println("");
		}
		
		System.out.println("\nPattern D");
		
		for(int i=0; i<6; i++) {
			
			for(int j=0; j<i; j++)
					System.out.print("  ");	
			
			
			for(int j=0; j<=6-i-1; j++) {
					//k=i-j;
					System.out.print(j+1+" ");
			}
			
		System.out.println("");
	}
		
		
	}
}
