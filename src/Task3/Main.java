package Task3;

import exception.ParameterValidateException;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = null;

	//	static List<Triangle> triangles = new ArrayList<>();

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

			//triangles.add(TriangleManager.makeEnvelope());
			System.out.println("Do u wanna to add next");
			line = read();
		}

		/*if(line.trim().toLowerCase().equals("yes")||line.trim().toLowerCase().equals("y")){
			triangles.add(TriangleManager.makeEnvelope());
		} else
		{*/
		triangles.sort(new SortBySquare());
		//triangles.print();
		System.out.println(triangles.printTrianglesList());




		/*triangles.add(new Triangle("Triangle2", 5, 6, 2));
		triangles.add(new Triangle("Triangle3", 5, 5, 2));
		triangles.add(new Triangle("Triangle3", 10, 7, 5));
		triangles.add(new Triangle("Triangle3", 3, 8, 7));

		triangles.sort(new SortBySquare());
		//triangles.print();
		System.runMakeEnvelopers.println(triangles.printTrianglesList());*/


		//System.runMakeEnvelopers.println(triangle.print());

		//Collections.sort(triangles, Triangle.bySquare);

		/*for (Triangle str : triangles) {
			System.runMakeEnvelopers.println(str);
		}*/

	}

	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}


}
