package Task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuckyTicket {

	private int min;
	private int max;


	public LuckyTicket(int min, int max) {

		this.min = min;
		this.max = max;
	}

	public int countSimple(int min, int max) {

		int sum = 0;

		for (int i = min; i <= max; i++) {
			int[] arrayOfNumbers = splitNumber(i);
			for (int k = 0; k < arrayOfNumbers.length; k++) {
				if (arrayOfNumbers[0] + arrayOfNumbers[1] + arrayOfNumbers[2] ==
						arrayOfNumbers[3] + arrayOfNumbers[4] + arrayOfNumbers[5]) {
					sum++;
				}
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


	private int[] splitNumber(int number) {

		String numberAsString = Integer.toString(number);
		String arrayStringNumbers[] = numberAsString.split("");
		int arrayNumbers[] = new int[arrayStringNumbers.length];

		for (int j = 0; j < arrayStringNumbers.length; j++) {
			arrayNumbers[j] = Integer.parseInt(arrayStringNumbers[j]);

		}

		return arrayNumbers;
	}

	private String checkWinner() {

		StringBuilder builder = new StringBuilder();

		int resultComplicatedMethod = countComplicated(min, max);
		int resultSimpleMethod = countSimple(min, max);

		if (resultComplicatedMethod > resultSimpleMethod) {
			builder.append("Winner-complicated method\n");
		} else if (resultComplicatedMethod < resultSimpleMethod) {
			builder.append("Winner-simple method\n");
		} else {
			builder.append("No winner\n");
		}

		builder.append("simple method ").append(resultSimpleMethod).append(" happy tickets\n")
				.append("complicated method ").append(resultComplicatedMethod).append(" happy tickets");

		return builder.toString();
	}


	public void printWinner() {
		System.out.println(checkWinner());
	}


	public static void printInstruction() {
		System.out.println("Instruction:\n" +
				"Input min and max number of ticket, it must be six-digit positive and integer  numbers.\n" +
				"2 ways to count lucky tickets:\n" +
				"1. Simple - if the sum of the first three digits is equal\n" +
				"the sum of the last three, then this ticket is lucky.\n" +
				"2. Complicated - if the sum of the even numbers of the ticket is equal to the sum of the odd numbers of" +
				" the ticket, then the ticket\n" +
				"lucky. As a result, information about the winning method and " +
				"the number of lucky tickets for each method of calculation.");
	}

	public static int checkValidation(Scanner scanner) {

		int value;
		String line = scanner.nextLine();
		try {
			value = Integer.parseInt(line);
		} catch (NumberFormatException e) {
			System.out.println("Incorrect result. Please, input integer number");
			return -1;
		}

		int amountOfNubers = String.valueOf(value).length();

		if (value > 0 && amountOfNubers == 6) {
			return value;
		}

		System.out.println("Please, input six-digit positive number");
		return -1;

	}
}
