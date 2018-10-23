package Task6;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketManager {
	static int min;

	public static TicketsAnalyzer initializeTickets() {


		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter min:");
			 min = scanner.nextInt();


			while (!checkValidation(min)) {
				min = scanner.nextInt();
			}
			System.out.println("enter max:");
			int max = scanner.nextInt();
			while (!checkValidation(max)) {
				max = scanner.nextInt();
			}

			if (min > max) {
				return new TicketsAnalyzer(max, min);
			} else {
				return new TicketsAnalyzer(min, max);
			}
		} catch (InputMismatchException e) {
			System.out.println("incorrect value, need number");
		}
		return null;
	}

	public static boolean checkValidation(int value) {


		int amountOfNumbers = String.valueOf(value).length();

		if (value > 0 && amountOfNumbers == 6) {
			return true;
		}

		System.out.println("Please, input six-digit positive number");
		return false;

	}


}
