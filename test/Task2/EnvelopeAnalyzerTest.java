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
public class EnvelopeAnalyzerTest {

	private double inputNumber1;
	private double inputNumber2;
	private double inputNumber3;
	private double inputNumber4;
	private boolean expectedResult;

	private Envelope envelope1;
	private Envelope envelope2;
	private static EnvelopeAnalyzer analyzer;

	public EnvelopeAnalyzerTest(double inputNumber1,double inputNumber2, double inputNumber3,double inputNumber4,
	                            boolean expectedResult) {
		this.inputNumber1 =  inputNumber1;
		this.inputNumber2 =  inputNumber2;
		this.inputNumber3 =  inputNumber3;
		this.inputNumber4 =  inputNumber4;
		this.expectedResult = expectedResult;
	}


	@BeforeClass
	public static void setUp() throws Exception {
	analyzer=new EnvelopeAnalyzer();

	}

	@Parameterized.Parameters
	public static Collection numbers() {
		return Arrays.asList(new Object[][]{
				{2,3,4,5, true},
				{2.8,3.9,4.5,5.8, true},
				{4,3,4,5, true},
				{4.9,5.9,4.8,3.8, false},
				{4,5,2,3, false},
				{4,5,4,3, false},
				{3,3,3,3, false}

		});
	}


	@Test
	public void testisFits() throws ParameterValidateException {
		envelope1 = new Envelope(inputNumber1,inputNumber2);
		envelope2 = new Envelope(inputNumber3,inputNumber4);

		assertEquals(expectedResult,
				analyzer.isFits(envelope1,envelope2));

	}

}