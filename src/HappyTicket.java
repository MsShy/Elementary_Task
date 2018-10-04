public class HappyTicket {

	private int min;
	private int max;

	public HappyTicket() {
		outputInstruction();
	}

	public HappyTicket(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int countSimple(int min, int max) {

		int sum = 0;
		for (int i = min; i <= max; i++) {
			int number1 = i / 100000;
			int number2 = (i / 10000) % 10;
			int number3 = (i / 1000) % 10 % 10;
			int number4 = (i / 100) % 10 % 10 % 10;
			int number5 = (i / 10) % 10 % 10 % 10 % 10;
			int number6 = i % 10 % 10 % 10 % 10;

			if (number1 + number2 + number3 == number4 + number5 + number6) {
				sum++;
			}
		}
		return sum;
	}


	public int countComplicated(int min, int max) {


		int sum = 0;

		for (int i = min; i <= max; i++) {
			int sumOfEvenNumbers = 0;
			int sumOfOddNumbers = 0;
			int[] arrayOfNumbers = splitNumber(i);

			for (int k = 0; k < arrayOfNumbers.length; k++) {

				if ((arrayOfNumbers[k] % 2) == 0) {
					sumOfEvenNumbers += arrayOfNumbers[k];
				} else {
					sumOfOddNumbers += arrayOfNumbers[k];
				}
			}
			if (sumOfEvenNumbers == sumOfOddNumbers) {
				sum++;
			}
		}

		return sum;
	}


	public int[] splitNumber(int number) {

		String numberAsString = Integer.toString(number);
		String arrayStringNumbers[] = numberAsString.split("");
		int arrayNumbers[] = new int[arrayStringNumbers.length];

		for (int j = 0; j < arrayStringNumbers.length; j++) {
			arrayNumbers[j] = Integer.parseInt(arrayStringNumbers[j]);

		}

		return arrayNumbers;
	}

	public void checkWinner() {

		int resultComplicatedMethod = countComplicated(min, max);
		int resultSimpleMethod = countSimple(min, max);

		if (resultComplicatedMethod > resultSimpleMethod) {
			System.out.println("Winner-complicated method");
		} else {
			System.out.println("Winner-simple method");
		}

		System.out.println("simple method " + resultSimpleMethod + " happy tickets\n" +
				"complicated method " + resultComplicatedMethod + " happy tickets");
	}

	public void outputInstruction() {
		System.out.println("input");//todo
	}

	public boolean checkValidation(int min, int max) {//todo

		boolean correctValidation = false;
		int amountOfMinNubers = String.valueOf(min).length();
		int amountOfMaxNubers = String.valueOf(max).length();

		if (min > 0 && max > 0 && min < max && amountOfMinNubers == 6 && amountOfMaxNubers == 6) {
			correctValidation = true;
		}
		return correctValidation;
	}
}
