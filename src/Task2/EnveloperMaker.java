package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnveloperMaker {


	private static Scanner scanner = null;
	private static final String WORD_TO_CONTINUE="yes";
	private static final String WORD_TO_CONTINUE2="y";


	public static Envelope makeEnveloper() {


		try {


			double a1 = getNumber("enter a side envelope:");

			while (!checkValidation(a1)) {
				a1 = getNumber("enter a envelope:");
			}
			System.out.println("enter b envelope:");
			double b = getNumber("enter b side envelope:");

			while (!checkValidation(b)) {
				b = getNumber("enter b side envelope:");
			}
			return new Envelope(a1, b);


		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.println("incorrect value, need number format");
		}
		return null;
	}


	public static void makeEnvelopers() {

		EnvelopeAnalyzer analyzer = new EnvelopeAnalyzer();
		//analyzer.add(EnveloperMaker.makeEnveloper());

		Scanner scanner = new Scanner(System.in);
		System.out.println("Add 1st enveloper");
		Envelope envelope = EnveloperMaker.makeEnveloper();
		while (envelope == null) {
			envelope = EnveloperMaker.makeEnveloper();
		}
		analyzer.add(envelope);
		//analyzer.add(EnveloperMaker.makeEnveloper());
		System.out.println("Add 2st enveloper");
		envelope = EnveloperMaker.makeEnveloper();
		while (envelope == null) {
			envelope = EnveloperMaker.makeEnveloper();
		}
		analyzer.add(envelope);
		//analyzer.add(EnveloperMaker.makeEnveloper());
		if (analyzer.isFits()) {
			System.out.println("envel 1st can put into env2");
		} else {
			System.out.println("envel 1st can not put into env2");
		}

		System.out.println("Do u wanna to continue");
		String line = scanner.nextLine();

		while (line.trim().equalsIgnoreCase(WORD_TO_CONTINUE) || line.trim().equalsIgnoreCase(WORD_TO_CONTINUE2)) {
			analyzer.removeAll();
			scanner = new Scanner(System.in);
			System.out.println("Add 1st enveloper");
			envelope = EnveloperMaker.makeEnveloper();
			while (envelope == null) {
				envelope = EnveloperMaker.makeEnveloper();
			}
			analyzer.add(envelope);
			//analyzer.add(EnveloperMaker.makeEnveloper());
			System.out.println("Add 2st enveloper");
			envelope = EnveloperMaker.makeEnveloper();
			while (envelope == null) {
				envelope = EnveloperMaker.makeEnveloper();
			}

			analyzer.add(envelope);
			//analyzer.add(EnveloperMaker.makeEnveloper());
			if (analyzer.isFits()) {
				System.out.println("envel 1st can put into env2");
			} else {
				System.out.println("envel 1st can not put into env2");
			}

			System.out.println("Do u wanna to continue");
			line = scanner.nextLine();
		}

		/*if(line.trim().toLowerCase().equals("yes")||line.trim().toLowerCase().equals("y")){
			triangles.add(TriangleManager.makeEnveloper());
		} else
		{*/


	}

	public static boolean checkValidation(double value) {

		if (value > 0) {
			return true;
		}
		return false;
	}


	private static double getNumber(String message) {
		while (true) {
			//mainController.print("Enter a number to add to the store:");
			System.out.println(message);
			final String input = read();
			try {

				return Double.parseDouble(input);
			} catch (NumberFormatException e) {
				//mainController.print(String.format("Expected a number, but entered '%s'%nTry again", e.getMessage()));
				System.out.println("Expected a numbe,try again " + e.getMessage());
			}
		}
	}

	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		//logger.info(String.format("User input from the console: '%s'", line));
		return line;
	}


}
		/*boolean gh;
		do {
			gh = result();
			System.makeEnvelopers.println(gh);
		}
		while (gh);
		{
			System.makeEnvelopers.println("exit");
		}

	}*/

	/*public static void main(String[] args) {

		boolean gh;
		do {
			gh = result();
			System.makeEnvelopers.println(gh);
		}
		while (gh);
		{
			System.makeEnvelopers.println("exit");
		}

	}

	public static boolean result() {
		boolean toContinue = true;
		Scanner scanner = new Scanner(System.in);

		System.makeEnvelopers.println("Input height first enveloper");
		double height1 = Envelope.checkValidation(scanner);
		System.makeEnvelopers.println("Input width first enveloper");
		double width1 = Envelope.checkValidation(scanner);

		System.makeEnvelopers.println("Input height second enveloper");
		double height2 = Envelope.checkValidation(scanner);
		System.makeEnvelopers.println("Input height second enveloper");
		double width2 = Envelope.checkValidation(scanner);

		Envelope envelope1 = new Envelope(height1, width1);
		Envelope envelope2 = new Envelope(height2, width2);

		if (envelope1.compareEnvelop(envelope2) == -1) {
			System.makeEnvelopers.println("envelope1<envelope2");
		} else if (envelope1.compareEnvelop(envelope2) == 0) {
			System.makeEnvelopers.println("envelope1==envelope2");
		} else {
			System.makeEnvelopers.println("you can't put envelope1 in envelope2");
		}


		System.makeEnvelopers.println("Do you wanna continue. press yes or y");
		String contin = scanner.nextLine().toLowerCase();
		System.makeEnvelopers.println(contin);
		switch (contin) {
			case ("yes"):
			case ("y"):

				break;
			default:
				toContinue = false;

				break;
		}

		return toContinue;
	}*/
