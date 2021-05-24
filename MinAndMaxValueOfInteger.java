package Variables;

public class MinAndMaxValueOfInteger {

	public static void main(String[] args) {

		int MyIntMinValue = Integer.MIN_VALUE;
		int MyIntMaxValue = Integer.MAX_VALUE; 
		System.out.println("Minimum Integer Value is : "+MyIntMinValue);
		System.out.println("Maximum Integer Value is : "+MyIntMaxValue);
		System.out.println("Busted Minimum Integer Value is : "+(MyIntMinValue - 1)); //UnderFlow - If you try to put a value smaller than the minimum value in java , it is called as UnderFlow .
		System.out.println("Busted Maximum Integer Value is : "+(MyIntMaxValue + 1)); //OverFlow - If you try to put a value larger than the maximum value in java , it is called as OverFlow .
		
	}

}
