package Exercise_05_13;

public class Exercise_05_13 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		while((int)Math.pow(n, 3)<12000)
			n++;
		
		System.out.println(n);
		
	}
}