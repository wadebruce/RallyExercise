package exercise.numbers;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise.numbers.Number;
import exercise.numbers.ThousandsPlace;


public class ThousandsPlaceTest {

	Number thousandsPlace;
	
	@Before
	public void setUp() throws Exception {
		thousandsPlace = new ThousandsPlace(2523);
	}

	@After
	public void tearDown() throws Exception {
		thousandsPlace = null;
	}

	@Test
	public void testPrintsCorrectlyFor2523() {
		String expected = "two thousand five hundred twenty-three";
		String actual = thousandsPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintsCorrectlyForExactThousandOf9000() {
		thousandsPlace = new ThousandsPlace(9000);
		String expected = "nine thousand";
		String actual = thousandsPlace.printNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintsCorrectlyForTooLargeOf91000() {
		thousandsPlace = new ThousandsPlace(91000);
		String expected = "one thousand";
		String actual = thousandsPlace.printNumber();
		assertEquals(expected, actual);
	}
}
