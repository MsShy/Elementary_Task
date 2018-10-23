package Task8;

import exception.ParameterValidateException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class NumbersFibonacciTest {
	private static NumbersFibonacci numbersFibonacci=new NumbersFibonacci();


	@BeforeClass
	public static void setUp()  {
		numbersFibonacci=new NumbersFibonacci();
	}


	@Test
	public void testGenerateFibonacci() throws ParameterValidateException {
		String expectResult="144 233 377 610 987";


		assertEquals(expectResult,
				numbersFibonacci.generateFibonacci(3).trim());

	}

	@Test
	public void testGenerateFibonacci1() throws ParameterValidateException {

		String expectResult="5";


		assertEquals(expectResult,
				numbersFibonacci.generateFibonacci(3,7).trim());

	}


	@Test(expected = ParameterValidateException.class)
	public void testGenerateFibonacciByLengthCheckValidationExceptionL() throws ParameterValidateException {
				numbersFibonacci.generateFibonacci(0);

	}

	@Test(expected = ParameterValidateException.class)
	public void testGenerateFibonacciByIntervalCheckValidationException() throws ParameterValidateException {
		numbersFibonacci.generateFibonacci(0,0);
		numbersFibonacci.generateFibonacci(0,1);
		numbersFibonacci.generateFibonacci(1,0);

	}
}