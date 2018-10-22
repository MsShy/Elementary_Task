package Task4;

import exception.ParameterValidateException;
import exception.FileException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {





	static Scanner scanner = null;

	public static void main(String[] args) throws IOException {

		/*Parser parser = new Parser();


		String text = parser.reader(FILE_PATH);
		System.out.println(text);*/


		scanner = new Scanner(System.in);

		String menu = getMenu();
		boolean start = true;
		while (start) {
			System.out.println(menu);
			String input = scanner.nextLine();
			switch (input) {
				case "1":
					countMatch();
					break;
				case "2":
					replaceMatch();
					break;
				case "3":
					start = false;
					scanner.close();
					break;
				default:
					System.out.println("Enter incorrect menu item\nExpected from 1 to 3");
			}
		}


	}

	private static String getMenu() {
		StringBuilder builder = new StringBuilder("Menu items:").append("\n")
				.append("1 - count mathces").append("\n")
				.append("2 - replace ").append("\n")
				.append("3 - exit").append("\n")
				.append("Select operations:");
		return builder.toString();
	}


	static void countMatch() {

		Parser parser=new Parser();

		System.out.println("ent path");
		String line=read();

		System.out.println("ent word");
		String line2=read();

		try {
			System.out.println(parser.countMatches(line,line2));
		} catch (ParameterValidateException | FileException e) {
			System.out.println(e.getMessage());
		}

	}

	static void replaceMatch() throws FileNotFoundException {

		Parser parser=new Parser();

		System.out.println("ent path");
		String line=read();

		System.out.println("ent word");
		String line2=read();

		System.out.println("ent word to replace");
		String line3=read();

		try {
			System.out.println(parser.replaceMatchesData(line,line2,line3));
		} catch (ParameterValidateException | FileException e) {
			System.out.println(e.getMessage());
		}

	}


	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}

}
