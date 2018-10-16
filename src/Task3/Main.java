package Task3;

import java.util.Scanner;

public class Main {

	//	static List<Triangle> triangles = new ArrayList<>();

	public static void main(String[] args) {

		Triangles triangles = new Triangles();

		Triangle triangle1 = TriangleManager.init();
		while (triangle1 == null) {
			triangle1 = TriangleManager.init();
		}
		triangles.add(triangle1);


		Scanner scanner = new Scanner(System.in);
		System.out.println("Do u wanna to add next");
		String line = scanner.nextLine();

		while (line.trim().toLowerCase().equals("yes") || line.trim().toLowerCase().equals("y")) {

			triangle1 = TriangleManager.init();
			while (triangle1 == null) {
				triangle1 = TriangleManager.init();
			}
			triangles.add(triangle1);


			//triangles.add(TriangleManager.makeEnveloper());
			System.out.println("Do u wanna to add next");
			line = scanner.nextLine();
		}

		/*if(line.trim().toLowerCase().equals("yes")||line.trim().toLowerCase().equals("y")){
			triangles.add(TriangleManager.makeEnveloper());
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
		System.makeEnvelopers.println(triangles.printTrianglesList());*/


		//System.makeEnvelopers.println(triangle.print());

		//Collections.sort(triangles, Triangle.bySquare);

		/*for (Triangle str : triangles) {
			System.makeEnvelopers.println(str);
		}*/
	}


}
