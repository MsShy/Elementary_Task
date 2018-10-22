package Task3;

import exception.ParameterValidateException;
import validation.Validator;

public class Triangle {

	public String name;
	double a;
	double b;
	double c;
	double perimetr;
	double square;


	Triangle(String name, double a, double b, double c) throws ParameterValidateException {
		this.name = name;
		setA(a);
		setB(b);
		setC(c);
		Validator.isTriangle(a, b, c);
		perimetr = perimeter(a, b, c);
		square = getSquare();
	}


/*	public static boolean checkValidation(double a, double b, double c) {

		System.out.println(a + "," + b + "," + c);

		if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {

			return true;
		}


		return false;
	}*/

	public double perimeter(double a, double b, double c) {
		return (this.a + this.b + this.c) / 2;
	}

	public double getSquare() {
		double s;
		s = Math.sqrt(perimetr * (perimetr - this.a) * (perimetr - this.b) * (perimetr - this.c));
		return s;
	}

	public String print() {
		StringBuilder builder = new StringBuilder();
		builder.append("[" + name + "]:" + square + "cm\n");
		return builder.toString();
	}



/*	public static Comparator<Triangle> bySquare = new Comparator<Triangle>() {

		public int isFits(Triangle s1, Triangle s2) {


			return Double.isFits(s1.getSquare(), s2.getSquare());

		}
	};*/

	public void setA(final double a) throws ParameterValidateException {
		Validator.isPositive(a,"side a of triangle");
		this.a = a;
	}

	public void setB(final double b) throws ParameterValidateException {
		Validator.isPositive(b,"side b of triangle");
		this.b = b;
	}

	public void setC(final double c) throws ParameterValidateException {
		Validator.isPositive(c,"side c of triangle");
		this.c = c;
	}

	@Override
	public String toString() {
		return "[" + name + ":]" +String.format("%.2f", square)+ "cm";
	}

}
