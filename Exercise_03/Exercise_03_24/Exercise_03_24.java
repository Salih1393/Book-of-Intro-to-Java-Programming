package Exercise_03_24;

public class Exercise_03_24 {
	
	public static void main(String[] args) {
	
		int num = (int)(Math.random()*52);
				
		int suitNum = num/13;
		String suit ="";
		System.out.println(num);
		switch (suitNum) {
		case 0:	suit="Clubs"; break;
		case 1:	suit="Diamonds"; break;
		case 2:	suit="Hearts"; break;
		case 3:	suit="Spades"; break;
		default:
			break;
		}
		System.out.println(suitNum);
		int rank = num%13;
		System.out.println(rank);
		switch (rank) {
		case 0:	System.out.println("The card you picked is King of " + suit); break;
		case 1:	System.out.println("The card you picked is Ace of " + suit); break;
		case 2:	System.out.println("The card you picked is 2 of " + suit); break;
		case 3:	System.out.println("The card you picked is 3 of " + suit); break;
		case 4:	System.out.println("The card you picked is 4 of " + suit); break;
		case 5:	System.out.println("The card you picked is 5 of " + suit); break;
		case 6:	System.out.println("The card you picked is 6 of " + suit); break;
		case 7:	System.out.println("The card you picked is 7 of " + suit); break;
		case 8:	System.out.println("The card you picked is 8 of " + suit); break;
		case 9: System.out.println("The card you picked is 9 of " + suit); break;
		case 10:System.out.println("The card you picked is 10 of " + suit); break;
		case 11:System.out.println("The card you picked is Jack of " + suit); break;
		case 12:System.out.println("The card you picked is Queen of " + suit); break;
		default:
			break;
		}
	
		
	}
}
