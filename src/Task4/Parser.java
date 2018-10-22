package Task4;

import exception.FileException;
import exception.ParameterValidateException;
import validation.*;

import java.io.*;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

	private static final String DEFAULT_FILE_NAME = "src/resources/text.txt";
	//D:\hwQAQC\Elementary_Task\src\resources\text.txt
	
	private String reader(String fileName) throws ParameterValidateException, FileException {

		Validator.validateParameter(fileName);
		Path pathName = Paths.get(fileName);
		File file = new File(String.valueOf(pathName));

		StringBuilder stringBuilder = new StringBuilder();
		try (FileInputStream fileInputStream = new FileInputStream(String.valueOf(file))) {
			String text;
			String encoding = "windows-1251";
			
			BufferedReader read = new BufferedReader(new InputStreamReader(fileInputStream, encoding));
			
			while ((text = read.readLine()) != null) {

				stringBuilder.append(text);
			}
		} catch (FileNotFoundException e) {
			throw new FileException(String.format("File not found: %s", pathName));
		}catch (IOException e) {
			throw new FileException(String.format("Can not read file '%s'", pathName));
		}
		return stringBuilder.toString();
	}
	
	
	public int countMatches(String fileName, String find) throws ParameterValidateException, FileException {
		String input = reader(fileName);
		
		int sum = 0;
		
		Pattern pattern = Pattern.compile("\\b+" + find + "\\b");//
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			sum++;
		}
		return sum;
		
	}
	
	public String replaceMatchesData(String fileName, String find, String replace) throws FileNotFoundException, ParameterValidateException, FileException {
		
		String input = reader(fileName);
		StringBuilder builder = new StringBuilder();
		
		//int sum = 0;
		
		Pattern pattern = Pattern.compile("\\b+" + find + "\\b");//
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			
			builder.append(matcher.replaceAll(replace));
			
			
		}

		if (!builder.toString().equals("")) {
			writer(fileName, builder.toString());
			System.out.println("yes");
		} else {
			System.out.println("no matches");
		}
		
		return builder.toString();
		
	}
	
	
	private boolean writer(String fileName, String text) throws FileNotFoundException {
		try {
			String encoding = "windows-1251";
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			OutputStreamWriter out = new OutputStreamWriter(fileOutputStream, encoding);
			out.write(text);
			out.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


}

