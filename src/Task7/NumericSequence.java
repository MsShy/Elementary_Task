package Task7;

import java.util.Arrays;
import java.util.List;

public class NumericSequence {


	private int n;
	private double m;

	public NumericSequence(int n, double m) {
		this.n = n;
		this.m = m;
	}

	public String countRow() {

		StringBuilder builder = new StringBuilder();

		if (checkValidation()) {

			int startValue = (int) Math.ceil(Math.sqrt(m));

			for (int i = 1; i <= n; i++) {
				System.out.println(i);
				if (i <= startValue) {
					builder.append(i).append(",");
				}
			}

		} else {
			return builder.append("incorrect").toString();
		}
		return builder.substring(0, builder.length() - 1);
	}


	public boolean checkValidation() {
		return !(n < 0 || m < 0);
	}


}
