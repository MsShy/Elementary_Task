package Task3;

import exception.ParameterValidateException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleCalculationsTest {
		private Triangle triangle ;

	@Before
	public void setUp() throws ParameterValidateException {
		triangle= new Triangle("Triangle1", 4, 5, 4);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testPerimeter() {

		double expectResult=6.5;

		assertEquals(expectResult, triangle.perimeter(4,5,4),0.1);

	}

	@Test
	public void testGetSquare() {

		double expectResult=7.81;

		assertEquals(expectResult, triangle.getSquare(),0.01);

	}
	
}