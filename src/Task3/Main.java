package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		List<Triangle> triangles = new ArrayList<>();


		triangles.add(new Triangle("Triangle1", 3, 15, 17));
		triangles.add(new Triangle("Triangle2", 5, 15, 4));
		triangles.add(new Triangle("Triangle3", 5, 5, 14));
		//System.out.println(triangle.print());

		Collections.sort(triangles, Triangle.bySquare);
		for (Triangle str : triangles) {
			System.out.println(str);
		}

	}
}
