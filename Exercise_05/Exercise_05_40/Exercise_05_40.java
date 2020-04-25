package Exercise_05_40;

public class Exercise_05_40 {
	public static void main(String[] args) {
		
		int heads = 0;
		int tails = 0;
		int coin = 0;
		
		for(int i=0; i<1000000; i++)			
			coin = (int)(Math.random()*2) == 0 ? heads++: tails++;
		
		System.out.println("Number of heads: "+heads+"\n"
						  +"Number of tails: "+tails);
	}
}
