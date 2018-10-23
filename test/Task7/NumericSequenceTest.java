package Task7;

import exception.ParameterValidateException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class NumericSequenceTest {
	private static NumericSequence sequence;

	@BeforeClass
	public static void setUp() throws ParameterValidateException {
		sequence = new NumericSequence(3, 9.5);
	}


	@Test
	public void testGenerateNumberSeries() {
		List<Integer> expectNumbers = new ArrayList<>();
		expectNumbers.add(1);
		expectNumbers.add(2);
		expectNumbers.add(3);


		assertEquals(expectNumbers, sequence.generateNumberSeries());

	}

	@Test
	public void testPrintNumbersSeries() {
		String expectResult = "1,2,3";

		assertEquals(expectResult, sequence.printNumbersSeries());
	}

	@Test(expected = ParameterValidateException.class)
	public void testParameterValidationOfSequence() throws ParameterValidateException {
		new NumericSequence(3, 0);
		new NumericSequence(0, 3);
		new NumericSequence(0, 0);
	}
	
}