package AssignmentPackage;

public class LeapYear {

	/*
	 * Mehtod Validating if a year is a leap year using some conditions... - The
	 * Year can be evenly divisible by 4, its a leap year; - The Year can be evenly
	 * divisible by 100, its NOT a leap year; - The year is evenly divisible by 400,
	 * its a leap year;
	 */

	public static void main(String[] args) {
		System.out.println("Method 1");
		System.out.println(validateLeapYear(2000) + "\n");

		System.out.println("Method 2");
		System.out.println(mathFunction());

	}

	public static boolean validateLeapYear(int Year) {
		boolean val = (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) ? true : false;
		return val;
	}

	/* Method for solving math following the PEMDAS rule */
	public static double mathFunction() {
		double mValue = 0, pValue = 100000, rValue = 0.005, nValue = 180, parenthesis = 0, exponent = 0, numerate = 0,
				denum = 0, bothNum = 0;
		parenthesis = (1 + rValue);
		exponent = Math.pow(parenthesis, nValue);
		numerate = rValue * exponent;
		denum = exponent;

		bothNum = numerate / (denum - 1);
		mValue = pValue * bothNum;
		return mValue;

	}

}
