
package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnvelopeAnalyzer {


	private List<Envelope> envelopeList=new ArrayList<>(2);

	public void add(Envelope envelope ) {
		envelopeList.add(envelope);
	}


	public boolean isFits(){

		if((envelopeList.get(0).getHeight()<envelopeList.get(1).getHeight() &&
				envelopeList.get(0).getWidth()<envelopeList.get(1).getWidth())||
				(envelopeList.get(0).getWidth()<envelopeList.get(1).getHeight() &&
				envelopeList.get(0).getHeight()<envelopeList.get(1).getWidth())){
			return true;
		}
		return false;
	}

	public void removeAll(){

		envelopeList.clear();
	}

}

