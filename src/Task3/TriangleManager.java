package Task3;

import exception.ParameterValidateException;

import java.util.Scanner;

public class TriangleManager {
	Triangles triangles = new Triangles();
	private static Scanner scanner = null;

	public static Triangle init() {
		String line;


		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter trianle:");

			String values = read();

			String[] arrayValues = values.split(",");

			while (arrayValues.length != 4 ||
					isEmpty(arrayValues))
					 {
				System.out.println("Input 4 param");
				values = read();
				arrayValues = values.split(",");
			}
			return new Triangle(arrayValues[0].trim(), Double.parseDouble(arrayValues[1].trim()),
					Double.parseDouble(arrayValues[2].trim()),
					Double.parseDouble(arrayValues[3].trim()));


		} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("jkjkj");
		} catch (ParameterValidateException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


/*	public static boolean checkValidation(double a, double b, double c) {

		System.out.println(a + "," + b + "," + c);

		if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {

			return true;
		}


		return false;
	}*/

	public static boolean isEmpty(String[] arrayValues) {

		boolean emptyValues = false;


		for (int i = 0; i < arrayValues.length; i++) {
			arrayValues[i].trim();

			if ( arrayValues[i].equals("")) {
				emptyValues = true;
			}

		}
		return emptyValues;
	}

	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}

}
