package Task8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class NumbersFibonacciTest {
	private NumbersFibonacci numbersFibonacci=new NumbersFibonacci();



	@Test
	public void testGenerateFibonacci() {
		String expectResult="1 1 2 3 5";


		assertEquals(expectResult,
				numbersFibonacci.generateFibonacci(3).trim());

	}

	@Test
	public void testGenerateFibonacci1() {

		String expectResult="1 1 2 3 5 8 13 21";


		assertEquals(expectResult,
				numbersFibonacci.generateFibonacci(1,30).trim());

	}
	
}