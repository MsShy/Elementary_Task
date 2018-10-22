package Task8;

import exception.ParameterValidateException;
import validation.Validator;

public class NumbersFibonacci {


	public String generateFibonacci(int length) throws ParameterValidateException {
		Validator.isPositive(length,"length");
		StringBuilder builder = new StringBuilder();
		int a = 1;
		int b = 1;
		int sumFibonacci=0;


		while (Integer.toString(sumFibonacci).length() <= length){

			sumFibonacci = a + b;
			a = b;
			b = sumFibonacci;

			if (Integer.toString(sumFibonacci).length() == length) {

				builder.append(sumFibonacci).append(" ");
			}
		}

		return builder.toString().trim();
	}

	public String generateFibonacci(int min, int max) throws ParameterValidateException {
		Validator.isPositive(min,"value");
		Validator.isPositive(max,"value");
		Validator.isEqual(min,max);


		StringBuilder builder = new StringBuilder();
		int a = 1;
		int b = 1;
		int sumFibonacci;

		for (int i = 0; i < max; i++) {
			sumFibonacci = a + b;
			a = b;
			b = sumFibonacci;

			if (sumFibonacci > min && sumFibonacci < max) {
				builder.append(sumFibonacci).append(" ");
			}
		}
		return builder.toString().trim();
	}

}
