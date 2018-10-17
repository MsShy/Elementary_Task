package Task2;

import Task2.entity.Envelope;

import java.util.Scanner;

public class EnvelopeMaker {


	private static Scanner scanner = null;
	private static String line;

	private static final String WORD_TO_CONTINUE = "yes";
	private static final String WORD_TO_CONTINUE2 = "y";


	private static Envelope makeEnvelope() {

		double a = 0;
		double b = 0;

		do {
			a = getNumber("enter height envelope:");
		}
		while (!checkValidation(a));

		do {
			b = getNumber("enter width envelope:");
		}
		while (!checkValidation(b));

		return new Envelope(a, b);

	}


	public static void runMakeEnvelopers() {

		do {

			EnvelopeAnalyzer analyzer = new EnvelopeAnalyzer();
			System.out.println("Add 1st enveloper");
			Envelope envelope1 = EnvelopeMaker.makeEnvelope();
			System.out.println("Add 2nd envelope");
			Envelope envelope2 = EnvelopeMaker.makeEnvelope();

			if (analyzer.isFits(envelope1, envelope2)) {
				System.out.println("1st envelope can put into 2nd envelope");
			} else {
				System.out.println("1st envelope can NOT put into 2nd envelope");
			}

			System.out.println("Do you wanna continue?");
			line = scanner.nextLine();
		}
		while (line.trim().equalsIgnoreCase(WORD_TO_CONTINUE) || line.trim().equalsIgnoreCase(WORD_TO_CONTINUE2));
		System.out.println("exit");
	}



	private static boolean checkValidation(double value) {
		if(value > 0){
			return true;
		}
		System.out.println("number must be positive");
		return false;
	}


	private static double getNumber(String message) {
		while (true) {

			System.out.println(message);
			final String input = read();
			try {

				return Double.parseDouble(input);
			} catch (NumberFormatException e) {
				System.out.println("Expected a number,try again " + e.getMessage());
			}
		}
	}

	private static String read() {
		scanner = new Scanner(System.in);
		 line = scanner.nextLine();
		return line;
	}


}
