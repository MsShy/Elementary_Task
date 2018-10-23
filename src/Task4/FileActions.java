package Task4;

import exception.FileException;
import exception.ParameterValidateException;
import validation.Validator;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileActions {
	private FileActions() {
	}
	public static String readFile(String pathName) throws ParameterValidateException, FileException {

		Validator.validateParameter(pathName);

		Path transformSeparatorOfPathForSystem = Paths.get(pathName);
		File file = new File(String.valueOf(transformSeparatorOfPathForSystem));

		StringBuilder stringBuilder = new StringBuilder();
		try (FileInputStream fileInputStream = new FileInputStream(String.valueOf(file))) {
			String text;
			String encoding = "windows-1251";

			BufferedReader read = new BufferedReader(new InputStreamReader(fileInputStream, encoding));

			while ((text = read.readLine()) != null) {

				stringBuilder.append(text);
			}
		} catch (FileNotFoundException e) {
			throw new FileException(String.format("File not found: %s", transformSeparatorOfPathForSystem));
		}catch (IOException e) {
			throw new FileException(String.format("Can not read file '%s'", transformSeparatorOfPathForSystem));
		}
		return stringBuilder.toString();
	}

	public static void writeFile(String pathName, String text) throws FileNotFoundException, ParameterValidateException, FileException {
		Validator.validateParameter(pathName);
		Validator.validateParameter(text);

		try {
			String encoding = "windows-1251";
			FileOutputStream fileOutputStream = new FileOutputStream(pathName);
			OutputStreamWriter out = new OutputStreamWriter(fileOutputStream, encoding);
			out.write(text);
			out.close();
		} catch (FileNotFoundException e) {
			throw new FileException(String.format("File not found: %s", pathName));
		} catch (IOException e) {
			throw new FileException(String.format("Can not read file '%s'", pathName));
		}
	}

}
