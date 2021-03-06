package Task7;

import exception.ParameterValidateException;
import validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class NumericSequence {


	private int n;
	private double m;

	public NumericSequence(int n, double m) throws ParameterValidateException {
		Validator.isPositive(n,"value");
		this.n = n;
		Validator.isPositive(m,"value");
		this.m = m;
	}

	public List<Integer> generateNumberSeries() {

		List<Integer> numbers = new ArrayList<>();

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
	}
}
