package Task4;

import exception.FileException;
import exception.ParameterValidateException;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileActionsTest {

	private static final String DEFAULT_FILE_PATH_READ_TEST = "test/resources/TestFileRead.txt";
	private static final String DEFAULT_FILE_PATH_WRITE_TEST = "test/resources/TestFileWrite.txt";


	@Test
	public void testReaderWithCorrectFileName() throws ParameterValidateException, FileException {

		String expected = "Потоки в Java определяются в качестве последовательности данных.";
		String actual = FileActions.readFile(DEFAULT_FILE_PATH_READ_TEST);
		assertEquals(expected, actual);
	}

	@Test(expected = FileException.class)
	public void testReadFileWithWrongFileName() throws ParameterValidateException, FileException {

		FileActions.readFile("test/resources/TestFil.txt");

	}
	@Test(expected = FileException.class)
	public void testReadFileWithWrongFilePath() throws ParameterValidateException, FileException {

		FileActions.readFile("test/resource/TestFil.txt");

	}
	@Test(expected = ParameterValidateException.class)
	public void testReadFileeWithFilePathIsEmpty() throws ParameterValidateException, FileException {

		FileActions.readFile("");
	}

	@Test(expected = ParameterValidateException.class)
	public void testReaderWithFileNameIsNull() throws ParameterValidateException, FileException {

		FileActions.readFile(null);
	}

	@Test
	public void testWriter() {

	}

	@Test
	public void testWriteFileWithCorrectFilePath() throws ParameterValidateException, FileException, FileNotFoundException {

		String expected = "Hello";
		FileActions.writeFile(DEFAULT_FILE_PATH_WRITE_TEST, "Hello");
		String actual = FileActions.readFile(DEFAULT_FILE_PATH_WRITE_TEST);
		assertEquals(expected, actual);
	}

}