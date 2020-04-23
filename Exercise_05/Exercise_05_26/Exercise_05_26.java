package Exercise_05_26;

public class Exercise_05_26 {

	public static void main(String[] args) {
		
		double e=1;
		double item=1;
		
		for(double i=1;i<=10000;i++) {

			item*=(i);
			e+=(1/item);
			
		}
		
		System.out.println("The e for i=10000  "+e);
		
		e=1;
		item=1;
		
		for(double i=1;i<=20000;i++) {

			item*=(i);
			e+=(1/item);
			
		}
		
		System.out.println("The e for i=20000  "+e);
		
		e=1;
		item=1;
		
		for(double i=1;i<=100000;i++) {

			item*=(i);
			e+=(1/item);
			
		}
		
		System.out.println("The e for i=100000 "+e);
	}
}
