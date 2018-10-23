package Task3;

import exception.ParameterValidateException;
import validation.Validator;

public class Triangle {

	public String name;
	double a;
	double b;
	double c;
	double perimeter;
	double square;


	Triangle(String name, double a, double b, double c) throws ParameterValidateException {
		this.name = name;
		setA(a);
		setB(b);
		setC(c);
		Validator.isTriangle(a, b, c);
		perimeter = perimeter(a, b, c);
		square = getSquare();
	}

	public double perimeter(double a, double b, double c) {
		return (this.a + this.b + this.c) / 2;
	}

	public double getSquare() {
		double s;
		s = Math.sqrt(perimeter * (perimeter - this.a) * (perimeter - this.b) * (perimeter - this.c));
		return s;
	}

	public void setA(final double a) throws ParameterValidateException {
		Validator.isPositive(a, "side a of triangle");
		this.a = a;
	}

	public void setB(final double b) throws ParameterValidateException {
		Validator.isPositive(b, "side b of triangle");
		this.b = b;
	}

	public void setC(final double c) throws ParameterValidateException {
		Validator.isPositive(c, "side c of triangle");
		this.c = c;
	}

	@Override
	public String toString() {
		return "[" + name + ":]" + String.format("%.2f", square) + "cm";
	}

}
