package Task4;

import java.io.*;

public class Parser {

	public String reader(String fileName) {
		StringBuilder stringBuilder = new StringBuilder();
		try (FileInputStream reader = new FileInputStream(fileName)) {
			String output;
			String UTF8 = "windows-1251";
			int BUFFER_SIZE = 8192;

			BufferedReader br = new BufferedReader(new InputStreamReader(reader,
					UTF8), BUFFER_SIZE);

			while ((output = br.readLine()) != null) {
				stringBuilder.append(output);
			}
		} catch (Exception e) {

		}
		return stringBuilder.toString();
	}





		/*	int size = reader.available();

			for (int i = 0; i < size; i++) {
				System.out.printChessBoard(output=(char) reader.read() + " ");
				stringBuilder.append(output);
			}
			reader.close();
		} catch (IOException e) {
			System.out.printChessBoard("Exception");
		}
		return stringBuilder.toString();
	}
*/

		/*try (FileReader reader = new FileReader(fileName);
		     BufferedReader bufferedReader = new BufferedReader(reader)) {
			String output;
			while ((output = bufferedReader.readLine()) != null) {
				stringBuilder.append(output);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return stringBuilder.toString();
	}*/

	public String replaceWords(String text) {

		StringBuilder stringBuilder = new StringBuilder();
		String[] sentence = text.split("[\\!|\\.|\\?]+\\s?");
		String[] sentenceResult = new String[sentence.length];

		for (int i = 0; i < sentence.length; i++) {
			sentenceResult[i] = sentence[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
			stringBuilder.append(sentenceResult[i] + " ");
		}

		return stringBuilder.toString().trim();

	}
}
	/*public boolean writer(String fileName, String text, boolean append) throws FileNotFoundException {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			OutputStreamWriter out = new OutputStreamWriter(fos, "UTF8");
			out.write(text);

			out.close();
			return true;
		}
		catch (IOException e) {
			e.printStackTrace();
		}return false;
	}
	public boolean writer(String fileName, String text) throws FileNotFoundException {
		return writer(fileName, text, true);
	}
}*/
