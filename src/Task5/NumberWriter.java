package Task5;

import exception.ParameterValidateException;
import validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class NumberWriter {

	public static final String[] THOUSANDS = {"", "одна тысяча", "две тысячи", "три тысячи", "четыре тысячи",
			"пять тысяч", "шесть тысяч", "семь тысяч", "восемь тысяч", "девять тысяч"};

	public static final String[] HUNDREDS = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
			"семьсот", "восемьсот", "девятсот"};

	public static final String[] TENS = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
			"семьдесят", "восемьдесят", "девяносто"};

	public static final String[] SECOND_TEN = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
			"пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

	public static final String[] ONES = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

	public static final String[] UTILITY = {"тысяч"};

	private String number;
	private List<String> result = new ArrayList<String>();


	public NumberWriter(String number) {
		this.number = number;

	}

	private List<String> transformNumber(String number) throws ParameterValidateException {

		NumberHandler numberHandler = new NumberHandler();
		numberHandler.setNumber(number);
		Validator.isAllowableLengthOfNumber(Integer.toString(numberHandler.getNumber()), "number");

		int[] arrayOfSplittedNumber = numberHandler.splitNumber();


		int i = 0;

		if (!numberHandler.positiveNumber) {
			result.add("минус");
		}
		switch (arrayOfSplittedNumber.length) {
			case 6:
				result.add(HUNDREDS[arrayOfSplittedNumber[i]]);
				i++;
			case 5:
				if (arrayOfSplittedNumber[i] == 1 && arrayOfSplittedNumber[i + 1] != 0) {
					result.add(SECOND_TEN[arrayOfSplittedNumber[i + 1]]);
					i++;

				} else {
					result.add(TENS[arrayOfSplittedNumber[i]]);
					i++;
				}
			case 4:

				if (arrayOfSplittedNumber.length != 4 && arrayOfSplittedNumber[i - 1] == 1 &&
						arrayOfSplittedNumber[i] != 0) {
					result.add(UTILITY[0]);

				} else if (arrayOfSplittedNumber.length != 4 && arrayOfSplittedNumber[i] == 0) {
					result.add(UTILITY[0]);

				} else {
					result.add(THOUSANDS[arrayOfSplittedNumber[i]]);
				}
				i++;

			case 3:
				result.add(HUNDREDS[arrayOfSplittedNumber[i]]);
				i++;

			case 2:
				if (arrayOfSplittedNumber[i] == 1 && arrayOfSplittedNumber[i + 1] != 0) {
					result.add(SECOND_TEN[arrayOfSplittedNumber[i + 1]]);
					break;

				} else {
					result.add(TENS[arrayOfSplittedNumber[i]]);
					i++;
				}

			case 1:
				result.add(ONES[arrayOfSplittedNumber[i]]);

		}


		return result;
	}


	public String printLetterNumber() {
		StringBuilder builder = new StringBuilder();

		try {
			result = transformNumber(number);
		} catch (ParameterValidateException e) {
			builder.append(e.getMessage());
		}
			for (String r : result) {

				if (!r.isEmpty()) {
					builder.append(r).append(" ");
				}
			}

		return builder.toString().trim();
	}
}
