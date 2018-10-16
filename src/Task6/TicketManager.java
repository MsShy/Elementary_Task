package Task6;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketManager {


	public static Tickets initializeTickets() {


		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter min:");
			int min = scanner.nextInt();


			while (!checkValidation(min)) {
				min = scanner.nextInt();
			}
			System.out.println("enter max:");
			int max = scanner.nextInt();
			while (!checkValidation(max)) {
				max = scanner.nextInt();
			}

			if (min > max) {
				return new Tickets(max, min);
			} else {
				return new Tickets(min, max);
			}
		} catch (InputMismatchException e) {
			System.out.println("incorrect value, need number");
		}
		return null;
	}

	public static boolean checkValidation(int value) {


		int amountOfNubers = String.valueOf(value).length();

		if (value > 0 && amountOfNubers == 6) {
			return true;
		}

		System.out.println("Please, input six-digit positive number");
		return false;

	}


}
