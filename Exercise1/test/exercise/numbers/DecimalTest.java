package exercise.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalTest {

	@Test
	public void testForNumberStartingWithZero() {
		String expected = " and 04/100";
		String actual = Number.convertDecimalValue("04");
		assertEquals(expected, actual);
	}

	@Test
	public void testForNumberStartingWithNumber() {
		String expected = " and 404/1000";
		String actual = Number.convertDecimalValue("404");
		assertEquals(expected, actual);
	}

	@Test
	public void testForNumberStartingWithOneCharachter() {
		String expected = " and 4/10";
		String actual = Number.convertDecimalValue("4");
		assertEquals(expected, actual);
	}
}
