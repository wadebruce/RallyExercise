package exercise.numbers;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TensPlaceTest {

	Number tensPlace;
	
	@Before
	public void setUp() throws Exception {
		tensPlace = new TensPlace(27);
	}

	@After
	public void tearDown() throws Exception {
		tensPlace = null;
	}

	@Test
	public void testPrintNumberHappyPathForLargerNumber() {
		tensPlace = new TensPlace(127);
		String expected = "twenty-seven";
		String actual = tensPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintNumberHappyPathFor27() {
		String expected = "twenty-seven";
		String actual = tensPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintNumberHappyPathFor39() {
		tensPlace = new TensPlace(39);
		String expected = "thirty-nine";
		String actual = tensPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintNumberHappyPathFor50() {
		tensPlace = new TensPlace(50);
		String expected = "fifty";
		String actual = tensPlace.printNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintNumberHappyPathFor92() {
		tensPlace = new TensPlace(92);
		String expected = "ninety-two";
		String actual = tensPlace.printNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintNumberHappyPathFor20() {
		tensPlace = new TensPlace(20);
		String expected = "twenty";
		String actual = tensPlace.printNumber();
		assertEquals(expected, actual);
	}
}
