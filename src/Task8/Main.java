package Task8;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

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
		System.out.println(fib.generateFibonacci(3));

	}

	private static void printFibonacciWithInterval() {
		NumbersFibonacci fib = new NumbersFibonacci();
		System.out.println(fib.generateFibonacci(1,30));
	}



	private static String getMenu() {
		StringBuilder builder = new StringBuilder("Menu items:").append("\n")
				.append("1 - fib with length").append("\n")
				.append("2 - with interval ").append("\n")
				.append("3 - exit").append("\n")
				.append("Select operations:");
		return builder.toString();
	}




		/*NumbersFibonacci fib = new NumbersFibonacci();
		System.runMakeEnvelopers.println(fib.generateFibonacci(10));
		System.runMakeEnvelopers.println(fib.generateFibonacci(1,30));
*/

}
