package Task4;

import exception.FileException;
import exception.ParameterValidateException;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

	private static final String DEFAULT_FILE_NAME = "src/resources/text.txt";
	//D:\hwQAQC\Elementary_Task\src\resources\text.txt
	

	public int countMatches(String fileName, String find) throws ParameterValidateException, FileException {
		String input = FileActions.readFile(fileName);
		
		int sum = 0;
		
		Pattern pattern = Pattern.compile("\\b+" + find + "\\b");//
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			sum++;
		}
		return sum;
		
	}
	
	public boolean replaceMatchesData(String fileName, String find, String replace) throws FileNotFoundException, ParameterValidateException, FileException {

		boolean success = true;
		String input = FileActions.readFile(fileName);
		StringBuilder builder = new StringBuilder();
		
		Pattern pattern = Pattern.compile("\\b+" + find + "\\b");//
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			builder.append(matcher.replaceAll(replace));
		}

		if (!builder.toString().equals("")) {
			FileActions.writeFile(fileName, builder.toString());

		} else {
			success = false;
		}
		
		return success;
		
	}

}

