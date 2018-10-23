package Task3;

import exception.ParameterValidateException;

import java.util.Scanner;

public class TriangleManager {
	private static Scanner scanner = null;

	public static Triangle init() {


		try {
			 scanner = new Scanner(System.in);
			System.out.println("enter triangle:");

			String values = read();

			String[] arrayValues = values.split(",");

			while (arrayValues.length != 4 ||
					isEmpty(arrayValues))
					 {
				System.out.println("Input 4 parameters with comma separated ( name of triangle, side a, side b," +
						" side c)");
				values = read();
				arrayValues = values.split(",");
			}
			return new Triangle(arrayValues[0].trim(), Double.parseDouble(arrayValues[1].trim()),
					Double.parseDouble(arrayValues[2].trim()),
					Double.parseDouble(arrayValues[3].trim()));


		} catch (NumberFormatException e) {
			System.out.println("input numbers of sides triangle");
		} catch (ParameterValidateException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


	private static boolean isEmpty(String[] arrayValues) {

		boolean emptyValues = false;

		for (int i = 0; i < arrayValues.length; i++) {
			arrayValues[i].trim();

			if ( arrayValues[i].equals("")) {
				emptyValues = true;
			}
		}
		return emptyValues;
	}

	private static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}

}
