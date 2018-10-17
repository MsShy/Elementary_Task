package Task2;

import Task2.entity.Envelope;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EnvelopeAnalyzerTest {

	private int inputNumber1;
	private int inputNumber2;
	private int inputNumber3;
	private int inputNumber4;
	private boolean expectedResult;

	private Envelope envelope1;
	private Envelope envelope2;
	private static EnvelopeAnalyzer analyzer;

	public EnvelopeAnalyzerTest(int inputNumber1,int inputNumber2, int inputNumber3,int inputNumber4,boolean expectedResult) {
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
				{4,3,4,5, true},
				{4,5,2,3, false},
				{4,5,4,3, false},
				{3,3,3,3, false}

		});
	}


	@Test
	public void testisFits() {
		envelope1 = new Envelope(inputNumber1,inputNumber2);
		envelope2 = new Envelope(inputNumber3,inputNumber4);

		System.out.println(envelope1.getHeight()+" "+envelope2.getWidth());
		assertEquals(expectedResult,
				analyzer.isFits(envelope1,envelope2));

	}
}