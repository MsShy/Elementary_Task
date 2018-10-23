package Task5;

public class NumberHandler {

	private int number;
	public boolean positiveNumber=true;

	public NumberHandler() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(final String number) {

		if (validateAsNumber(number) != 0) {
			this.number = validateAsNumber(number);
		}
	}


	public int[] splitNumber() {

		String numberAsString = Integer.toString(number);

		if (number < 0) {
			numberAsString = numberAsString.substring(1);
			positiveNumber = false;
		}

		String arrayStringNumbers[] = numberAsString.split("");
		int arrayNumbers[] = new int[arrayStringNumbers.length];

		for (int j = 0; j < arrayStringNumbers.length; j++) {
			arrayNumbers[j] = Integer.parseInt(arrayStringNumbers[j]);

		}
		return arrayNumbers;
	}


	private int validateAsNumber(String input) {
		if (input.matches("\\d+")) {
			input = input.replaceAll("^0+", "");
		}
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Expected an integer number and not 0 " + e.getMessage());
		}
		return 0;
	}
}
