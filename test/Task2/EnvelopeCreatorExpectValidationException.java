package Task2;

import Task2.entity.Envelope;
import exception.ParameterValidateException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EnvelopeCreatorExpectValidationException {
	
	private double inputNumber1;
	private double inputNumber2;
	
	
	public EnvelopeCreatorExpectValidationException(double inputNumber1, double inputNumber2) {
		this.inputNumber1 = inputNumber1;
		this.inputNumber2 = inputNumber2;
	}
	
	
	@Parameterized.Parameters
	public static Collection numbers() {
		return Arrays.asList(new Object[][]{
				{1, 0},
				{0, 1},
				{0, 0}
		});
	}
	
	
	@Test(expected = ParameterValidateException.class)
	public void testEnvelopeCreateCheckOnParameterValidateException() throws ParameterValidateException {
		
		Envelope envelope1 = new Envelope(inputNumber1, inputNumber2);
		
		System.out.println(inputNumber1);
		System.out.println(envelope1);
		
	}
	
}
