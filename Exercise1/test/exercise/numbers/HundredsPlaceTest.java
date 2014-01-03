package exercise.numbers;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exercise.numbers.HundredsPlace;
import exercise.numbers.Number;


public class HundredsPlaceTest {

	Number hundredsPlace;
	
	@Before
	public void setUp() throws Exception {
		hundredsPlace = new HundredsPlace(356);
	}

	@After
	public void tearDown() throws Exception {
		hundredsPlace = null;
	}

	@Test
	public void testPrintingForThousands4556() {
		hundredsPlace = new HundredsPlace(4556);
		String expected = "five hundred fifty-six";
		String actual = hundredsPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingFor356() {
		String expected = "three hundred fifty-six";
		String actual = hundredsPlace.printNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintingFor789() {
		hundredsPlace = new HundredsPlace(789);
		String expected = "seven hundred eighty-nine";
		String actual = hundredsPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingForExactHundred100() {
		hundredsPlace = new HundredsPlace(100);
		String expected = "one hundred";
		String actual = hundredsPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingForExactHundred900() {
		hundredsPlace = new HundredsPlace(900);
		String expected = "nine hundred";
		String actual = hundredsPlace.printNumber();
		assertEquals(expected, actual);
	}
}
