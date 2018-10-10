package Task2;

import java.util.Scanner;

public class EnvelopeAnalyzer {


	public static void main(String[] args) {

		boolean gh;
		do {
			gh = result();
			System.out.println(gh);
		}
		while (gh);
		{
			System.out.println("exit");
		}

	}

	public static boolean result() {
		boolean toContinue = true;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input height first enveloper");
		double height1 = Envelope.checkValidation(scanner);
		System.out.println("Input width first enveloper");
		double width1 = Envelope.checkValidation(scanner);

		System.out.println("Input height second enveloper");
		double height2 = Envelope.checkValidation(scanner);
		System.out.println("Input height second enveloper");
		double width2 = Envelope.checkValidation(scanner);

		Envelope envelope1 = new Envelope(height1, width1);
		Envelope envelope2 = new Envelope(height2, width2);

		if (envelope1.compareEnvelop(envelope2) == -1) {
			System.out.println("envelope1<envelope2");
		} else if (envelope1.compareEnvelop(envelope2) == 0) {
			System.out.println("envelope1==envelope2");
		} else {
			System.out.println("you can't put envelope1 in envelope2");
		}


		System.out.println("Do you wanna continue. press yes or y");
		String contin = scanner.nextLine().toLowerCase();
		System.out.println(contin);
		switch (contin) {
			case ("yes"):
			case ("y"):

				break;
			default:
				toContinue = false;

				break;
		}

		return toContinue;
	}
}
