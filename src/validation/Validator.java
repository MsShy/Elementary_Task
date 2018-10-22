package validation;

import exception.ParameterValidateException;

public class Validator {
	private Validator() {
	}

	public static void isPositive(final int parameter, final String message) throws ParameterValidateException {
		if (parameter <= 0) {
			throw new ParameterValidateException(String.format("%s must not be negative and 0", message));
		}
	}

	public static void isPositive(final double parameter, final String message) throws ParameterValidateException {
		if (parameter <= 0) {
			throw new ParameterValidateException(String.format("%s must not be negative and 0", message));
		}
	}

	public static void isNull(final Object parameter, final String message) throws ParameterValidateException {
		if (parameter == null) {
			throw new ParameterValidateException(String.format("%s can not be NULL", message));
		}
	}

	public static void isTriangle(final double a, final double b, final double c) throws ParameterValidateException {
		if (a + b <= c || a + c <= b || b + c <= a) {
			throw new ParameterValidateException(String.format("not a triangle"));
		}
	}


	public static void isAllowableLengthOfNumber(final String parameter, final String message)throws ParameterValidateException {
		if (parameter.length()>6) {
			throw new ParameterValidateException(String.format("%s can not be NULL", message));
		}

	}

	public static void validateParameter(final String fileName) throws ParameterValidateException {
		if (fileName == null || fileName.equals("")) {
			throw new ParameterValidateException("Parameter incorrect");
		}
	}
	public static void isEqual(final int min, final int max) throws ParameterValidateException {
		if (min==max) {
			throw new ParameterValidateException(String.format("parameters must not be equal"));
		}
	}
}
