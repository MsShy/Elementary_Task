package Task3;

import exception.ParameterValidateException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TrianglesAddTest {

	Triangles triangles = new Triangles();

	@Test
	public void testAdd() throws ParameterValidateException {
	Triangle triangle=new Triangle("Triangle",5,4,6);
		assertTrue(triangles.add(triangle));
	}

	@Test(expected = ParameterValidateException.class)
	public void testAddNull() throws ParameterValidateException {
		Triangle triangle1=null;
		triangles.add(triangle1);
	}

}