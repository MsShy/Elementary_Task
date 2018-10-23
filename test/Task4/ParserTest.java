package Task4;

import exception.FileException;
import exception.ParameterValidateException;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;


public class ParserTest {
	private static final String DEFAULT_FILE_PATH = "test/resources/TestFileRead.txt";
	private static final String DEFAULT_FILE_TO_EDIT_PATH = "test/resources/TestFileEdit.txt";
	Parser parser;

	@Before
	public void setUp() throws Exception {
		parser = new Parser();
	}

	@Test
	public void testCountMatches() throws ParameterValidateException, FileException {
		int expectedResult = 2;
		int actualResult = parser.countMatches(DEFAULT_FILE_PATH, "в");
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCountNoMatches() throws ParameterValidateException, FileException {
		int expectedResult = 0;
		int actualResult = parser.countMatches(DEFAULT_FILE_PATH, "parser");
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testReplaceMatchesData() throws FileNotFoundException, FileException, ParameterValidateException {

		String expectedResult = "Java и Потоки определяются и качестве последовательности данных.";
		parser.replaceMatchesData(DEFAULT_FILE_TO_EDIT_PATH,"в", "и");
		String actualResult=FileActions.readFile(DEFAULT_FILE_TO_EDIT_PATH);
		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testReplaceMatchesDataNoMatches() throws FileNotFoundException, FileException, ParameterValidateException {

		String expectedResult = "Java и Потоки определяются и качестве последовательности данных.";
		parser.replaceMatchesData(DEFAULT_FILE_TO_EDIT_PATH,"parser", "Потоки");
		String actualResult=FileActions.readFile(DEFAULT_FILE_TO_EDIT_PATH);
		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testReplaceMatchesDataNoMatchesExpectedTrue() throws FileNotFoundException, FileException, ParameterValidateException {

		boolean expectedResult = true;
		boolean actualResult =parser.replaceMatchesData(DEFAULT_FILE_TO_EDIT_PATH, "Потоки", "Потоки");
		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testReplaceMatchesDataNoMatchesExpectedFalse() throws FileNotFoundException, FileException, ParameterValidateException {

		boolean expectedResult = false;
		boolean actualResult =parser.replaceMatchesData(DEFAULT_FILE_TO_EDIT_PATH, "parser", "Потоки");
		assertEquals(expectedResult, actualResult);

	}
}