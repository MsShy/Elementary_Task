package Task4;

import java.io.IOException;

public class Main {


	private static final String FILE_NAME = "src/resources/text.txt";


	public static void main(String[] args) throws IOException {

		Parser parser = new Parser();

		String text = parser.reader(FILE_NAME);
		System.out.println(text);
		//text.replaceAll(("[\\!|\\.|\\?]+\\s?"),"");

		String s = "из";
		int sum = 0;
		String[] arr = text.replaceAll(("[\\!|\\.|\\?|\\,]?\\s+")," ").split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("из")) {
				sum += 1;
			}
			System.out.println(arr[i]);
		}
		System.out.println("Sum" + sum);

		System.out.println(text.replace("наследуется от класса", "GoodBye"));

		String text1 = parser.replaceWords(text);

		/*parser.writer("src/main//resources/text1.txt",text1);
		parser.writer("src/main//resources/text2.txt",text2);
		parser.writer("src/main//resources/text3.txt",text3);*/
	}
}
