package Task3;

import exception.ParameterValidateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class TriangleParameterValidationTest {

	private String name;
	private double inputNumber1;
	private double inputNumber2;
	private double inputNumber3;


	public TriangleParameterValidationTest(String name, double inputNumber1, double inputNumber2, double inputNumber3) {
		this.name = name;
		this.inputNumber1 = inputNumber1;
		this.inputNumber2 = inputNumber2;
		this.inputNumber3 = inputNumber3;

	}


	@Parameterized.Parameters
	public static Collection numbers() {
		return Arrays.asList(new Object[][]{
				{"name1", 0, 0, 0},
				{"name2", 1, 0, 0},
				{"name3", 0, 1, 0},
				{"name4", 0, 0, 1},
				{"name5", 5, 1, 7},
				{"name6", 5, 7, 1},
				{"name7", 7, 5, 1},
				{"name8", 5, 2, 7},

		});
	}


	@Test(expected = ParameterValidateException.class)
	public void testTriangleCreateCheckOnParameterValidateException() throws ParameterValidateException {

		Triangle triangle = new Triangle(name, inputNumber1, inputNumber2, inputNumber3);


	}


}