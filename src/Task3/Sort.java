package Task3;

import java.util.Comparator;

public class Sort implements Comparator<Triangle> {


	@Override
	public int compare(final Triangle o1, final Triangle o2) {
		return Double.compare(o1.getSquare(), o2.getSquare());
	}
}
