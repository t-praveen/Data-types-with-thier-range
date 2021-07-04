//Min and Max value of Byte data type//

package Variables;

public class MinAndMaxValueOfByte {

	public static void main(String[] args) {

		byte MyByteMinValue = Byte.MIN_VALUE;
		byte MyByteMaxValue = Byte.MAX_VALUE; 
		System.out.println("Minimum byteeger Value is : "+MyByteMinValue);
		System.out.println("Maximum byteeger Value is : "+MyByteMaxValue);
		System.out.println("Busted Minimum byteeger Value is : "+(MyByteMinValue - 1)); //UnderFlow - If you try to put a value smaller than the minimum value in java , it is called as UnderFlow .
		System.out.println("Busted Maximum byteeger Value is : "+(MyByteMaxValue + 1)); //OverFlow - If you try to to put a value larger than the maximum value in java , it is called as OverFlow .
		
		
	}

}
