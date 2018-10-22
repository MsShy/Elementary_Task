package Task7;

import exception.ParameterValidateException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class NumericSequenceTest {
	NumericSequence sequence = new NumericSequence(3, 9.5);

	public NumericSequenceTest() throws ParameterValidateException {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

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