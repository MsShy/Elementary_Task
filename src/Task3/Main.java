package Task3;

import exception.ParameterValidateException;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = null;


	public static void main(String[] args) throws ParameterValidateException {
		String line;

		Triangles triangles = new Triangles();

		Triangle triangle1;

		do{

			triangle1 = TriangleManager.init();
		}
		while (triangle1 == null);
		triangles.add(triangle1);

		System.out.println("Do u wanna to add next");
		line = read();

		while (line.trim().toLowerCase().equals("yes") || line.trim().toLowerCase().equals("y")) {

			do{
				triangle1 = TriangleManager.init();
			}
			while (triangle1 == null);

			triangles.add(triangle1);

			System.out.println("Do u wanna to add next");
			line = read();
		}

		triangles.sort(new SortBySquare());
		System.out.println(triangles.printTrianglesList());

	}

	private static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}


}
