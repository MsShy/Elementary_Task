package Task2;

import Task2.entity.Envelope;
import exception.ParameterValidateException;
import org.junit.BeforeClass;
import org.junit.Test;


public class EnvelopeAnalyzerExpectValidationException {


	private Envelope envelope1;
	private Envelope envelope2;
	private static EnvelopeAnalyzer analyzer;


	@BeforeClass
	public static void setUp() throws Exception {
		analyzer = new EnvelopeAnalyzer();

	}

	@Test(expected = ParameterValidateException.class)
	public void testCheckIsFitsOnParameterValidationException() throws ParameterValidateException {

		envelope1 = null;
		envelope2 = new Envelope(5, 6);

		analyzer.isFits(envelope1, envelope2);
		analyzer.isFits(envelope1, envelope1);
		analyzer.isFits(envelope2, envelope1);

	}

}