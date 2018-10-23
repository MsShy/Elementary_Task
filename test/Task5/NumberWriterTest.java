package Task5;

import Task6.TicketManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class NumberWriterTest {
	NumberWriter numberWriter;

	public String inputLine;
	public String expectedResult;


	@Before
	public void setUp() throws Exception {

	}

	public NumberWriterTest(String inputLine, String expectedResult) {
		this.inputLine = inputLine;
		this.expectedResult = expectedResult;
	}


	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{
				{"999999", "девятсот девяносто девять тысяч девятсот девяносто девять"},
				{"100000", "сто тысяч"},
				{"100001", "сто тысяч один"},
				{"100010", "сто тысяч десять"},
				{"100100", "сто тысяч сто"},
				{"101000", "сто одна тысяча"},
				{"110000", "сто десять тысяч"},
				{"111000", "сто одиннадцать тысяч"},
				{"1", "один"},
				{"10", "десять"},
				{"15", "пятнадцать"},
				{"100", "сто"},
				{"1000", "одна тысяча"},
				{"10000", "десять тысяч"},
				{"11000", "одиннадцать тысяч"},
				{"-11000", "минус одиннадцать тысяч"}

		});
	}


	@Test
	public void testPrintLetterNumber() {
		numberWriter = new NumberWriter(inputLine);

		assertEquals(expectedResult,
				numberWriter.printLetterNumber());
	}
}
	
