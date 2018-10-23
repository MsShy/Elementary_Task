package Task8;

import exception.ParameterValidateException;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = null;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		String menu = getMenu();
		boolean start = true;
		while (start) {
			System.out.println(menu);
			String input = scanner.nextLine();
			switch (input) {
				case "1":
					printFibonacciWithLength();
					break;
				case "2":
					printFibonacciWithInterval();
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

	private static void printFibonacciWithLength() {
		NumbersFibonacci fib = new NumbersFibonacci();
		int length = getNumber("input length");
		try {
			System.out.println(fib.generateFibonacci(length));
		} catch (ParameterValidateException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void printFibonacciWithInterval() {
		NumbersFibonacci fib = new NumbersFibonacci();
		int min = getNumber("min");
		int max = getNumber("max");
		try {
			if (min > max) {
				System.out.println(fib.generateFibonacci(max, min));

			} else {
				System.out.println(fib.generateFibonacci(min, max));
			}
		} catch (ParameterValidateException e) {
			System.out.println(e.getMessage());
		}
	}


	private static String getMenu() {
		StringBuilder builder = new StringBuilder("Menu items:").append("\n")
				.append("1 - generate numbers fibonacci with length").append("\n")
				.append("2 - generate numbers fibonacci with interval ").append("\n")
				.append("3 - exit").append("\n")
				.append("Select operations:");
		return builder.toString();
	}


	private static int getNumber(String message) {
		while (true) {
			System.out.println(message);
			final String input = read();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Expected a number,try again " + e.getMessage());
			}
		}
	}

	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}


}
