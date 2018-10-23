package Task4;

import exception.ParameterValidateException;
import exception.FileException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {


	static Scanner scanner = null;

	public static void main(String[] args) throws IOException {


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
					System.out.println("Entered incorrect menu item\nExpected from 1 to 3");
			}
		}

	}

	private static String getMenu() {
		StringBuilder builder = new StringBuilder("Menu items:").append("\n")
				.append("1 - count matches of word").append("\n")
				.append("2 - replacing a word with another").append("\n")
				.append("3 - exit").append("\n")
				.append("Select operations:");
		return builder.toString();
	}


	static void countMatch() {

		Parser parser = new Parser();

		System.out.println("input path");
		String line = read();

		System.out.println("input word to count");
		String line2 = read();

		try {
			System.out.println(parser.countMatches(line, line2));
		} catch (ParameterValidateException | FileException e) {
			System.out.println(e.getMessage());
		}

	}

	static void replaceMatch() throws FileNotFoundException {

		Parser parser = new Parser();

		System.out.println("input path");
		String line = read();

		System.out.println("input word to search");
		String line2 = read();

		System.out.println("input word to replace");
		String line3 = read();

		try {
			boolean resultOfReplacement = parser.replaceMatchesData(line, line2, line3);
			if (resultOfReplacement) {
				System.out.println("all words are replaced");
			} else {
				System.out.println("not found word(s) to replace");
			}

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
