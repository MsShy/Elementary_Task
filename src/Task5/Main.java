package Task5;

import exception.ParameterValidateException;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = null;

	public static void main(String[] args) throws ParameterValidateException {


		System.out.println("Input a number (max length - 6-digit and except 0)");
		String line = read();
		NumberWriter numberWriter = new NumberWriter(line);
		System.out.println(numberWriter.printLetterNumber());

	}


	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
}
