package Task5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberHandlerTest {

	private NumberHandler numberHandler;

	@Before
	public void setUp() throws Exception {
		numberHandler = new NumberHandler();
	}


	@Test
	public void testSetCorrectPositiveNumber() {
		int expectResult = 12345;
		numberHandler.setNumber("12345");
		int actualResult = numberHandler.getNumber();
		assertEquals(expectResult, actualResult);
	}

	@Test
	public void testSetPositiveNumberWithStartAtZeros() {
		int expectResult = 50;
		numberHandler.setNumber("0050");
		int actualResult = numberHandler.getNumber();
		assertEquals(expectResult, actualResult);
	}

	@Test
	public void testSetNegativeNumberWithStartAtZeros() {
		int expectResult = -50;
		numberHandler.setNumber("-0050");
		int actualResult = numberHandler.getNumber();
		assertEquals(expectResult, actualResult);
	}

	@Test
	public void testSetCorrectNegativeNumber() {
		int expectResult = -12345;
		numberHandler.setNumber("-12345");
		int actualResult = numberHandler.getNumber();
		assertEquals(expectResult, actualResult);
	}

	@Test
	public void testSetLetterInsteadNumber() {
		int expectResult = 0;
		numberHandler.setNumber("number");
		int actualResult = numberHandler.getNumber();
		assertEquals(expectResult, actualResult);
	}



	@Test
	public void testSplitPositiveNumber() {
		int[] expectResult = {1,2,3,4,5,6};
		NumberHandler numberHandler = new NumberHandler();
		numberHandler.setNumber("123456");
		int[] actualResult = numberHandler.splitNumber();

		assertEquals(true, numberHandler.positiveNumber);
		assertArrayEquals(expectResult,actualResult);
	}

	@Test
	public void testSplitNegativeNumber() {
		int[] expectResult = {1,2,3,4,5,6};
		NumberHandler numberHandler = new NumberHandler();
		numberHandler.setNumber("-123456");
		int[] actualResult = numberHandler.splitNumber();

		assertEquals(false, numberHandler.positiveNumber);
		assertArrayEquals(expectResult,actualResult);
	}
	
}