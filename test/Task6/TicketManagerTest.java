package Task6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class TicketManagerTest {


	public int inputNumber;
	public boolean expectedResult;
	public TicketManager ticketManager;

	public TicketManagerTest(int inputNumber, boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{
				{222330, true},
				{22233022, false},
				{-1, false},
				{125, false}
		});
	}

	@Test
	public void testCheckValidation() {

		assertEquals(expectedResult,
				ticketManager.checkValidation(inputNumber));
	}
	
}