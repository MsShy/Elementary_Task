package Task5;

public class NumberWritter {
	private int number;

	public NumberWritter(int number) {
		this.number = number;
	}

	public String writeNumber() {

		int[] splitNumber = splitNumber(number);

		StringBuilder numberWords = new StringBuilder();

		String[] thousands = {"одна тысяча", "две тысячи", "три тысячи", "четыре тысячи", "пять тысяч", "шесть тысяч",
				"семь тысяч",
				"восемь тысяч", "девять тысяч"};
		String[] hundreds = {"cто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
				"восемьсот", "девятсот"};
		String[] tens = {"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
				"восемьдесят", "девяносто"};
		String[] ten = {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
				"шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

		String[] ones = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
		String[] th = {"тысяч"};


		int i = 0;
		switch (splitNumber.length) {

			case 6:
				numberWords.append(hundreds[splitNumber[i] - 1]).append(" ");
				if(splitNumber[i+1]==0 ){
					numberWords.append(th[0]);
					break;
				}
				i++;
			case 5:
				if(splitNumber[i+1]==0 ){
					numberWords.append(th[0]);
					break;
				}else if(splitNumber[i] == 1 && splitNumber[i + 1] != 0) {
					numberWords.append(ten[splitNumber[i+1] - 1]).append(" ").append(th[0]);
					i++;


				} else {
				numberWords.append(tens[splitNumber[i] - 1]).append(" ");
				i++;}

			case 4:
				numberWords.append(thousands[splitNumber[i] - 1]).append(" ");
				if(splitNumber[i+1]==0 ){
					break;
				}
				i++;
			case 3:
				numberWords.append(hundreds[splitNumber[i] - 1]).append(" ");
				i++;
				if (splitNumber[i] == 0 && splitNumber[i + 1] == 0) {
					break;
				}
			case 2:
				if (splitNumber[i] == 1 && splitNumber[i + 1] != 0) {
					numberWords.append(ten[splitNumber[i] - 1]);
					break;
				} else if (splitNumber[i] == 0 && splitNumber[i + 1] != 0) {
					i++;
				} else if (splitNumber[i] == 0 && splitNumber[i + 1] == 0) {
					break;
				} else {
					numberWords.append(tens[splitNumber[i] - 1]).append(" ");
					i++;
				}
			case 1:
				numberWords.append(ones[splitNumber[i] - 1]).append(" ");
				break;
		}


		return numberWords.toString();
	}


	public void show() {

		System.out.println(writeNumber());
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
