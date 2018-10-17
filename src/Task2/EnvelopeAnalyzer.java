
package Task2;

import Task2.entity.Envelope;

import java.util.ArrayList;
import java.util.List;

public class EnvelopeAnalyzer {



	public boolean isFits(Envelope envelope1, Envelope envelope2){

		if((envelope1.getHeight()<envelope2.getHeight() &&
				envelope1.getWidth()<envelope2.getWidth())||
				(envelope1.getWidth()<envelope2.getHeight() &&
						envelope1.getHeight()<envelope2.getWidth())){
			return true;
		}
		return false;
	}


}

