package Task3;

import exception.ParameterValidateException;
import validation.Validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Triangles {


	private List<Triangle> triangles = new ArrayList<>();

	public boolean add(Triangle triangle) throws ParameterValidateException {
		Validator.isNull(triangle, "Triangle");
		return triangles.add(triangle);
	}

	public void sort(Comparator<Triangle> comparator) {
		Collections.sort(triangles, comparator);
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
