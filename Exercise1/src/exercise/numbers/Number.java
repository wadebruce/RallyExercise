package exercise.numbers;
import java.util.HashMap;
import java.util.Map;

public abstract class Number {

	protected static final String TENS_HOLDER = "TENS_PLACE_MAP_KEY_";
	protected static final Map<String, String> numberLookup;
	
	protected Number nextNumberPlace;
	protected int number;
	
	public abstract String printNumber();
	
	static {
		numberLookup = new HashMap<String, String>();
		numberLookup.put("0", "zero");
		numberLookup.put("1", "one");
		numberLookup.put("2", "two");
		numberLookup.put("3", "three");
		numberLookup.put("4", "four");
		numberLookup.put("5", "five");
		numberLookup.put("6", "six");
		numberLookup.put("7", "seven");
		numberLookup.put("8", "eight");
		numberLookup.put("9", "nine");
		numberLookup.put("10", "ten");
		numberLookup.put("11", "eleven");
		numberLookup.put("12", "twelve");
		numberLookup.put("13", "thirteen");
		numberLookup.put("14", "fourteen");
		numberLookup.put("15", "fifteen");
		numberLookup.put("16", "sixteen");
		numberLookup.put("17", "seventeen");
		numberLookup.put("18", "eighteen");
		numberLookup.put("19", "nineteen");
		numberLookup.put(TENS_HOLDER + "2", "twenty");
		numberLookup.put(TENS_HOLDER + "3", "thirty");
		numberLookup.put(TENS_HOLDER + "4", "forty");
		numberLookup.put(TENS_HOLDER + "5", "fifty");
		numberLookup.put(TENS_HOLDER + "6", "sixty");
		numberLookup.put(TENS_HOLDER + "7", "seventy");
		numberLookup.put(TENS_HOLDER + "8", "eighty");
		numberLookup.put(TENS_HOLDER + "9", "ninety");
	}
	
	protected static int getMyPlaces(int inputNumber, int numberOfDigits) {
		String inputNumberString = Integer.toString(inputNumber);
		int inputNumberStringLength = inputNumberString.length();
		String appropriateNumberString = inputNumberString.substring(inputNumberStringLength-numberOfDigits, inputNumberStringLength);
		return new Integer(appropriateNumberString);
	}
	
	public static String convertDecimalValue(String decimalValue) {
		return " and " + decimalValue + "/" + getDenominator(decimalValue);
	}
	
	private static String getDenominator(String decimalValue) {
		StringBuilder sb = new StringBuilder("1");
		int numberOfZeros = decimalValue.length();
		for(int x=0; x<numberOfZeros; x++) {
			sb.append("0");
		}
		return sb.toString();
	}
}