
package Task2;

import Task2.entity.Envelope;
import exception.ParameterValidateException;
import validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class EnvelopeAnalyzer {

	public EnvelopeAnalyzer() {
	}

	public boolean isFits(Envelope envelope1, Envelope envelope2) throws ParameterValidateException {

		Validator.isNull(envelope1, "envelope 1st");
		Validator.isNull(envelope2, "envelope 2nd");

		return (envelope1.getHeight() < envelope2.getHeight() &&
				envelope1.getWidth() < envelope2.getWidth()) ||
				(envelope1.getWidth() < envelope2.getHeight() &&
						envelope1.getHeight() < envelope2.getWidth());
	}


}

