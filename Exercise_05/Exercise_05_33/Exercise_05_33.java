package Exercise_05_33;

public class Exercise_05_33 {
	public static void main(String[] args) {	
		
		for(int i=2; i<10000; i++) {
		
			int num = i;
			int sum=0;			
			
			int j =2;
			while(j<num) {
				
				if(num%j==0) 
					sum+=j;
							
				j++;	
			}			
			
			if(sum+1==i)
				System.out.println(i+" is a perfect number");			
			
		}
		
	}
}
