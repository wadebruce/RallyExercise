package exercise.numbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OnesPlaceTest {

	Number onesPlace;
	
	@Before
	public void setUp() throws Exception {
		onesPlace = new OnesPlace(5);
	}

	@After
	public void tearDown() throws Exception {
		onesPlace = null;
	}

	@Test
	public void testPrintingNumberForLargerNumber() {
		onesPlace = new OnesPlace(17);
		String expected = "seven";
		String actual = onesPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingNumberFor0() {
		onesPlace = new OnesPlace(0);
		String expected = "zero";
		String actual = onesPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingNumberHappyPath() {
		String expected = "five";
		String actual = onesPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingNumberHappyPathFor8() {
		onesPlace = new OnesPlace(8);
		String expected = "eight";
		String actual = onesPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintingNumberHappyPathFor2() {
		onesPlace = new OnesPlace(2);
		String expected = "two";
		String actual = onesPlace.printNumber();
		assertEquals(expected, actual);
	}

}