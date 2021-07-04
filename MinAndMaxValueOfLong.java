//Min and Max value of Long data type//

package Variables;

public class MinAndMaxValueOfLong {

	public static void main(String[] args) {

		long MyLongMinValue = Long.MIN_VALUE;
		long MyLongMaxValue = Long.MAX_VALUE; 
		System.out.println("Minimum Integer Value is : "+MyLongMinValue);
		System.out.println("Maximum Integer Value is : "+MyLongMaxValue);
		System.out.println("Busted Minimum Integer Value is : "+(MyLongMinValue - 1)); //UnderFlow - If you try to put a value smaller than the minimum value in java , it is called as UnderFlow .
		System.out.println("Busted Maximum Integer Value is : "+(MyLongMaxValue + 1)); //OverFlow - If you try to to put a value larger than the maximum value in java , it is called as OverFlow .
		
	}

}
