package data_types;

public class IntegersPractice {

	public static void main(String[] args) 
	{
		byte myFirstByte = Byte.MIN_VALUE;
		byte mySecondByte = Byte.MAX_VALUE;
		System.out.println("Lowest byte value is = "+  myFirstByte);
		System.out.println("Highest byte value is = "+ mySecondByte);
		
		short myFirstShort = Short.MIN_VALUE;
		short mySecondShort = Short.MAX_VALUE;
		System.out.println("Lowest short value is = "+ myFirstShort);
		System.out.println("Highest short value is = "+ mySecondShort);
		
		int myFirstInteger = Integer.MIN_VALUE;
		int mySecondInteger = Integer.MAX_VALUE;
		System.out.println("Lowest Integer value is = "+ myFirstInteger);
		System.out.println("Highest Integer value is = "+ mySecondInteger);

		long myFirstlong = Long.MIN_VALUE;
		long mySecondlong = Long.MAX_VALUE;
		System.out.println("Lowest long value is = "+ myFirstlong);
		System.out.println("Highest long value is = "+ mySecondlong);

		System.out.println("Done for normal whole number");
	}

}
