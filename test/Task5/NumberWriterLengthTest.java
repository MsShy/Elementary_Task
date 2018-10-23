package Task5;

import exception.ParameterValidateException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


public class NumberWriterLengthTest {

	@Test
	public void testPrintLetterNumber() {
		NumberWriter numberWriter = new NumberWriter("1234567");
		String expectResult = "number max 6-digit number";
		numberWriter.printLetterNumber();
		assertEquals(expectResult, numberWriter.printLetterNumber());
	}
}
	
