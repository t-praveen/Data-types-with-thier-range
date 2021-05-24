package Variables;

public class Challenge {

	public static void main(String[] args) {

		byte b = 10 ;
		int i = 30 ;
		short s = 20 ;
		long total = (50000L + 10L * (b + i + s));
		System.out.println("The Total Sum is = "+total);
		short ShortTotal = (short)(50000L + 10L * (b + i + s));
		System.out.println("The Total Sum is = "+ShortTotal);
		
	}

}
