package Exercise_05_39;

public class Exercise_05_39 {
	public static void main(String[] args) {
		
		int salesAmount=0;
		int remainedCom=30000;
		
		while(remainedCom>0) {
			
			if(salesAmount<5000) {
				salesAmount+=5000;
				remainedCom-=(5000*8)/100;
			}
			
			else if(salesAmount>=5000 && salesAmount <10000) {
				salesAmount+=5000;
				remainedCom-=(5000*10)/100;
			}
			
			else {				
				salesAmount+=remainedCom*100/12;	
				remainedCom=0;
			}
		}
		
		System.out.println("Minimum sales to earn $30,000: "+salesAmount);
		
	}
}
