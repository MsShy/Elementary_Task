package Task6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class SimpleMethodTest {
	public int inputNumber;
	public boolean expectedResult;
	public Ticket ticket;

	public SimpleMethodTest(int inputNumber, boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}


	@Before
	public void setUp() throws Exception {
		ticket = new Ticket(inputNumber);
	}


	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{
				{222330, true},
				{222334, false}
		});
	}


	@Test
	public void testIsLuckyTicketByCountSimple() {
		System.out.println("Parameterized Number is : " + inputNumber + " " + expectedResult);
		assertEquals(expectedResult,
				ticket.isLuckyTicketByCountSimple(inputNumber));
	}



	@Test
	public void testGetNumber() {

		assertEquals(inputNumber,
				ticket.getNumber());

	}
	
}