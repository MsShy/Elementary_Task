package Task3;

import java.util.Comparator;

public class SortBySquare implements Comparator<Triangle> {


	@Override
	public int compare(final Triangle o1, final Triangle o2) {
			return	Double.compare(o2.getSquare(), o1.getSquare());
	}
}
