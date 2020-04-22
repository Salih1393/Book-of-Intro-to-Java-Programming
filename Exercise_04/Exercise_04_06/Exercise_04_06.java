package Exercise_04_06;

public class Exercise_04_06 {
	
	public static void main(String[] args) {
		
	final int radius = 40;	
		
	double firstAngle = (Math.random()*(2*Math.PI));
	double secondAngle = (Math.random()*(2*Math.PI));
	double thirdAngle = (Math.random()*(2*Math.PI));
		
	double x1 = radius * Math.cos(firstAngle);
	double y1 = radius * Math.sin(firstAngle);
	
	double x2 = radius * Math.cos(secondAngle);
	double y2 = radius * Math.sin(secondAngle);
	
	double x3 = radius * Math.cos(thirdAngle);
	double y3 = radius * Math.sin(thirdAngle);
	
	double a = Math.pow(Math.pow(x1-x2, 2)+(Math.pow(y1-y2, 2)), 0.5);
	double b = Math.pow(Math.pow(x1-x3, 2)+(Math.pow(y1-y3, 2)), 0.5);
	double c = Math.pow(Math.pow(x2-x3, 2)+(Math.pow(y2-y3, 2)), 0.5);
	
	double angle1 = Math.toDegrees(Math.acos((b*b + c*c - a*a)/(2*b*c)));
	double angle2 = Math.toDegrees(Math.acos((c*c + a*a - b*b)/(2*c*a)));
	double angle3 = 180-angle1-angle2;
	
	System.out.printf("First angle is %2.0f\n",angle1);
	System.out.printf("Second angle is %2.0f\n",angle2);
	System.out.printf("Third angle is %2.0f",angle3);
	}
}
