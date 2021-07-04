////Min and Max value of Float data type//

package Variables;

public class MinAndMaxValueOfShort {

	public static void main(String[] args) {

		short MyShortMinValue = Short.MIN_VALUE;
		short MyShortMaxValue = Short.MAX_VALUE; 
		System.out.println("Minimum Integer Value is : "+MyShortMinValue);
		System.out.println("Maximum Integer Value is : "+MyShortMaxValue);
		System.out.println("Busted Minimum Integer Value is : "+(MyShortMinValue - 1)); //UnderFlow - If you try to put a value smaller than the minimum value in java , it is called as UnderFlow .
		System.out.println("Busted Maximum Integer Value is : "+(MyShortMaxValue + 1)); //OverFlow - If you try to to put a value larger than the maximum value in java , it is called as OverFlow .
		
	}

}
