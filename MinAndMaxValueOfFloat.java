//Min and Max value of Float//

package Variables;

public class MinAndMaxValueOfFloat {

	public static void main(String[] args) {

		float MyFloatMinValue = Float.MIN_VALUE;
		float MyFloatMaxValue = Float.MAX_VALUE; 
		System.out.println("Minimum Integer Value is : "+MyFloatMinValue);
		System.out.println("Maximum Integer Value is : "+MyFloatMaxValue);
		System.out.println("Busted Minimum Integer Value is : "+(MyFloatMinValue - 1)); //UnderFlow - If you try to put a value smaller than the minimum value in java , it is called as UnderFlow .
		System.out.println("Busted Maximum Integer Value is : "+(MyFloatMaxValue + 1)); //OverFlow - If you try to to put a value larger than the maximum value in java , it is called as OverFlow .
		
	}

}
