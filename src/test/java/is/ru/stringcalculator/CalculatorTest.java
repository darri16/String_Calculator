package is.ru.stringcalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testNewLine() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test(expected = RuntimeException.class)
	public void testNegativeNumbers() {
    	Calculator.add("2,-4,3,-5");
	}

	@Test
	public void testNegativeNumberException() {
    RuntimeException exception = null;
	    try {
	        Calculator.add("2,-4,3,-5");
	    } catch (RuntimeException e) {
	        exception = e;
	    }
	    assertNotNull(exception);
	    assertEquals("Negatives not allowed: [-4, -5]", exception.getMessage());
	}
}












