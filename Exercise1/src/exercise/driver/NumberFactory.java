package exercise.driver;

import exercise.numbers.HundredsPlace;
import exercise.numbers.OnesPlace;
import exercise.numbers.Number;	
import exercise.numbers.TenThousandsPlace;
import exercise.numbers.TensPlace;
import exercise.numbers.ThousandsPlace;

public class NumberFactory {

	public static Number getNumber(int input) {
		Number number = null;
		if(input >= 0 && input < 10) {
			number = new OnesPlace(input);
		} else if (input > 9 && input < 100) {
			number = new TensPlace(input);
		} else if (input > 99 && input < 1000) {
			number = new HundredsPlace(input);
		} else if (input > 999 && input < 10000) {
			number = new ThousandsPlace(input);
		} else if (input > 9999 && input < 100000) {
			number = new TenThousandsPlace(input);
		}
		else {
			System.out.println("Invalid Input");
		}
		return number;
	}
}
