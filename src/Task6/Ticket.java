package Task6;


public class Ticket {

	private int number;


	public Ticket(int number) {

		this.number = number;

	}

	public boolean countSimple(int number) {

		boolean luckyTicket;
		int[] arrayOfNumbers = splitNumber(number);


		if (arrayOfNumbers[0] + arrayOfNumbers[1] + arrayOfNumbers[2] ==
				arrayOfNumbers[3] + arrayOfNumbers[4] + arrayOfNumbers[5]) {
			luckyTicket = true;
		} else {
			luckyTicket = false;
		}


		return luckyTicket;
	}


	public boolean countComplicated(int number) {

		boolean luckyTicket;

		int sumOfEvenNumbers = 0;
		int sumOfOddNumbers = 0;
		int[] arrayOfNumbers = splitNumber(number);

		for (int k = 0; k < arrayOfNumbers.length; k++) {
			if ((arrayOfNumbers[k] % 2) == 0) {
				sumOfEvenNumbers += arrayOfNumbers[k];
			} else {
				sumOfOddNumbers += arrayOfNumbers[k];
			}
		}

		if (sumOfEvenNumbers == sumOfOddNumbers) {
			luckyTicket = true;
		} else {
			luckyTicket = false;
		}

		return luckyTicket;
	}


	private int[] splitNumber(int number) {

		String numberAsString = Integer.toString(number);
		String arrayStringNumbers[] = numberAsString.split("");
		int arrayNumbers[] = new int[arrayStringNumbers.length];

		for (int j = 0; j < arrayStringNumbers.length; j++) {
			arrayNumbers[j] = Integer.parseInt(arrayStringNumbers[j]);

		}

		return arrayNumbers;
	}

	public int getNumber() {
		return number;
	}


}
