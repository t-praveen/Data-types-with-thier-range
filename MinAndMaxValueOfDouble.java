//Min and Max value of Double data type//

package Variables;

public class MinAndMaxValueOfDouble {

	public static void main(String[] args) {

		double MyDoubleMinValue = Double.MIN_VALUE;
		double MyDoubleMaxValue = Double.MAX_VALUE; 
		System.out.println("Minimum Integer Value is : "+MyDoubleMinValue);
		System.out.println("Maximum Integer Value is : "+MyDoubleMaxValue);
		System.out.println("Busted Minimum Integer Value is : "+(MyDoubleMinValue - 1)); //UnderFlow - If you try to put a value smaller than the minimum value in java , it is called as UnderFlow .
		System.out.println("Busted Maximum Integer Value is : "+(MyDoubleMaxValue + 1)); //OverFlow - If you try to to put a value larger than the maximum value in java , it is called as OverFlow .
		
	}

}
