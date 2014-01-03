package exercise.numbers;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TenThousandsPlaceTest {

	Number tensThousands;
	
	@Before
	public void setUp() throws Exception {
		tensThousands = new TenThousandsPlace(12500);
	}

	@After
	public void tearDown() throws Exception {
		tensThousands = null;
	}

	@Test
	public void testCorrectFor12500() {
		String expected = "twelve thousand five hundred";
		String actual = tensThousands.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCorrectForExactThousands() {
		tensThousands = new TenThousandsPlace(40000);
		String expected = "forty thousand";
		String actual = tensThousands.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCorrectFor34527() {
		tensThousands = new TenThousandsPlace(34527);
		String expected = "thirty-four thousand five hundred twenty-seven";
		String actual = tensThousands.printNumber();
		assertEquals(expected, actual);
	}
}
