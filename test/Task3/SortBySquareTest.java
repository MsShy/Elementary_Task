package Task3;

import exception.ParameterValidateException;
import org.junit.*;

import static org.junit.Assert.*;


public class SortBySquareTest {

	Triangles trianglesActual;
	Triangles trianglesExpected;


	@Before
	public void setUp() throws Exception {
		trianglesExpected = new Triangles();
		Triangle triangle1=new Triangle("Triangle1",9,6,7);
		Triangle triangle2=new Triangle("Triangle1",7,4,5);
		Triangle triangle3=new Triangle("Triangle1",5,2,4);
		trianglesExpected.add(triangle1);
		trianglesExpected.add(triangle2);
		trianglesExpected.add(triangle3);
	}



	@Test
	public void testSortTriangles() throws ParameterValidateException {
		trianglesActual = new Triangles();
		Triangle triangle1=new Triangle("Triangle1",7,4,5);
		Triangle triangle2=new Triangle("Triangle1",5,2,4);
		Triangle triangle3=new Triangle("Triangle1",9,6,7);
		trianglesActual.add(triangle1);
		trianglesActual.add(triangle2);
		trianglesActual.add(triangle3);
		trianglesActual.sort(new SortBySquare());

		assertEquals(trianglesExpected.printTrianglesList(), trianglesActual.printTrianglesList());
	}
	
}