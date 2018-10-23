package Task4;

import exception.FileException;
import exception.ParameterValidateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ActionWriteExceptionsTest {

	private String filePath;
	private String text;

	private static final String DEFAULT_FILE_PATH_WRITE_TEST = "test/resources/TestFileWrite.txt";


	public ActionWriteExceptionsTest(String filePath, String text) {
		this.filePath = filePath;
		this.text = text;
	}



	@Parameterized.Parameters
	public static Collection numbers() {
		return Arrays.asList(new Object[][]{
				{null, "Hello"},
				{DEFAULT_FILE_PATH_WRITE_TEST , null},
				{"", "Hello"},
				{DEFAULT_FILE_PATH_WRITE_TEST , ""}
		});
	}



	@Test(expected = ParameterValidateException.class)
	public void testWriteFileExpectedValidationExceptions() throws ParameterValidateException, FileException, FileNotFoundException {

		FileActions.writeFile(filePath,text);

	}

}
