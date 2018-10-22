package Task5;

import exception.ParameterValidateException;
import validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class NumberWritter {
	private String number;

	List<String> result = new ArrayList<String>();

	public static final String[] THOUSANDS ={"", "одна тысяча", "две тысячи", "три тысячи", "четыре тысячи",
			"пять тысяч", "шесть тысяч","семь тысяч","восемь тысяч", "девять тысяч"};

	public static final String[] HUNDREDS = {"", "cто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
			"семьсот", "восемьсот", "девятсот"};

	public static final String[] TENS = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
			"семьдесят","восемьдесят", "девяносто"};

	public static final String[] ONES = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

	public static final String[] SECOND_TEN={"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
			"шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

	public static final String[] UTILITY ={"тысяч"};


	public NumberWritter(String number) {
		this.number = number;

	}

	public List<String> writeNumber(String number) throws ParameterValidateException {


		Validator.isAllowableLengthOfNumber(number,"number");

		int num = validateAsNumber(number);
		int[] splitedNumber = splitNumber(num);


		int i = 0;

		switch (splitedNumber.length) {
			case 6:
				result.add(HUNDREDS[splitedNumber[i]]);
				i++;
			case 5:
				if (splitedNumber[i] == 1 && splitedNumber[i + 1] != 0) {
					result.add(TENS[splitedNumber[i + 1]]);
					i++;

				} else {
					result.add(TENS[splitedNumber[i]]);
					i++;
				}

			case 4:

				if (splitedNumber.length != 4 && splitedNumber[i - 1] == 1 && splitedNumber[i] != 0) {
					result.add(UTILITY[0]);

				} else if (splitedNumber.length != 4 && splitedNumber[i] == 0) {
					result.add(UTILITY[0]);

				} else {
					result.add(THOUSANDS[splitedNumber[i]]);
				}
				i++;

			case 3:
				result.add(HUNDREDS[splitedNumber[i]]);
				i++;

			case 2:
				if (splitedNumber[i] == 1 && splitedNumber[i + 1] != 0) {
					result.add(SECOND_TEN[splitedNumber[i + 1]]);
					break;

				} else {
					result.add(TENS[splitedNumber[i]]);
					i++;
				}

			case 1:
				if (splitedNumber.length == 1 && splitedNumber[i] == 0) {
					result.add("ноль");
				} else {
					result.add(ONES[splitedNumber[i]]);

				}
				//nol todo
				//numberWords.append(ones[splitNumber[i]]);
				//result[6] = ones[splitNumber[i]];

		}


		return result;
	}


	public String show() throws ParameterValidateException {
		StringBuilder builder = new StringBuilder();
		result = writeNumber(number);
		if (result != null) {


			for (String s : result) {

				if (!s.isEmpty()) {

					builder.append(s).append(" ");
				}
			}
		} else {
			builder.append("can't write");
		}


		return builder.toString();
	}


	public int validateAsNumber(String input) {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Expected a numbe,try again " + e.getMessage());
		}
		return -1;
	}



	public int[] splitNumber(int number) {

		String numberAsString = Integer.toString(number);
		if (number < 0) {
			numberAsString = numberAsString.substring(1);
		}

		String arrayStringNumbers[] = numberAsString.split("");
		int arrayNumbers[] = new int[arrayStringNumbers.length];

		for (int j = 0; j < arrayStringNumbers.length; j++) {
			arrayNumbers[j] = Integer.parseInt(arrayStringNumbers[j]);

		}
		return arrayNumbers;
	}


}
