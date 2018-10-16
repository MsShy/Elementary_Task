package Task2;

import java.util.Scanner;

public class Envelope {

	private double height;
	private double width;

	public Envelope(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}


/*public int compareEnvelop(Envelope envelope) {
		if (height < envelope.height && width < envelope.width) {
			return -1;
		} else if (height == envelope.height && width == envelope.width) {
			return 0;
		}else {
			return 1;
		}
	}*/

	/*public static double checkValidation(Scanner scanner) {

		double side;
		String line = scanner.nextLine();
		try {
			side = Double.parseDouble(line);
		} catch (NumberFormatException e) {
			System.makeEnvelopers.println("incorrect");

			return -1;
		}

		return side;
	}*/



}
