package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Triangle {

	public String name;
	double a;
	double b;
	double c;
	double perimetr;
	double square;


	Triangle(String name, double a, double b, double c) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
//a + b > c and a + c > b and b + c > a:
		perimetr = perimetr(a, b, c);
		this.square = getSquare();
	}


	public double perimetr(double a, double b, double c) {
		return (this.a + this.b + this.c) / 2;
	}

	public double getSquare() {
		double s;
		s = Math.sqrt(perimetr * (perimetr - this.a) * (perimetr - this.b) * (perimetr - this.c));
		return s;
	}

	public String print() {
		StringBuilder builder = new StringBuilder();
		builder.append("[" + name + "]:" + square + "cm");
		return builder.toString();
	}

	public static Comparator<Triangle> bySquare = new Comparator<Triangle>() {

		public int compare(Triangle s1, Triangle s2) {


			return Double.compare(s1.getSquare(), s2.getSquare());

		}
	};

	@Override
	public String toString() {
		return "[" + name + ":]" + square + "cm" + "]";
	}


}
