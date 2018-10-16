package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Triangles {


	private List<Triangle> triangles = new ArrayList<>();

	public void add(Triangle triangle) {
		triangles.add(triangle);
	}

	public void sort(Comparator<Triangle> comparator) {
		Collections.sort(triangles, comparator);
	}


	public void print() {

		int i = 1;
		for (Triangle t : triangles) {
			System.out.println(i + "." + t.toString());
			i++;
		}
	}


	public String printTrianglesList() {

		StringBuilder builder = new StringBuilder();
		builder.append("=============Triangles list=============").append("\n");
		int i = 1;
		for (Triangle t : triangles) {

			builder.append(i).append(".").append(t).append("\n");
			i++;
		}

		return builder.toString();
	}
}
