package Task7;

import java.util.ArrayList;
import java.util.List;

public class NumericSequence {


	private int n;
	private double m;

	public NumericSequence(int n, double m) {
		this.n = n;
		this.m = m;
	}

	public List<Integer> generateNumberSeries() {

		List<Integer> numbers = new ArrayList<>();

		//if (checkValidation()) {

			for (int i = 1; i <= n; i++) {
				if (Math.pow(i, 2) < m) {
					numbers.add(i);
				}
			}

		return numbers;
	}

	public String printNumbersSeries() {

		List<Integer> numbersSeries = generateNumberSeries();

		StringBuilder builder = new StringBuilder();
		for (Integer n : numbersSeries) {
			builder.append(n).append(",");
		}

		return builder.substring(0, builder.length() - 1);
	//	System.runMakeEnvelopers.println(builder.substring(0, builder.length() - 1));
	}




}
