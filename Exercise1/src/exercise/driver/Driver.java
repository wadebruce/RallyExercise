package exercise.driver;

import java.util.Scanner;
import exercise.numbers.Number;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number between 0 and 99,999. Numbers only: ");
			String input = in.next();
			String[] splitInput = splitInput(input);
			String output = buildOutput(splitInput);
			printOutput(output);
		}
	}

	private static String[] splitInput(String input) {
		String[] splitInput = input.split("\\.");
		return splitInput;
	}

	private static String buildOutput(String[] splitInput) {
		String output = "";
		int numberToConvert = new Integer(splitInput[0]);
		Number number = NumberFactory.getNumber(numberToConvert);
		output = number.printNumber();
		if(splitInput.length > 1) {
			output = output + Number.convertDecimalValue(splitInput[1]);
		}
		return output;
	}
	
	private static void printOutput(String output) {
		String firstCharacter = output.substring(0,1).toUpperCase();
		String outputWithOutFirstChar = output.substring(1, output.length());
		String finalOutput = firstCharacter + outputWithOutFirstChar;
		System.out.println("\t" + finalOutput);
	}
}
