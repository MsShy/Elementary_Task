package Task8;

public class NumbersFibon {


	public String generateFibonacci(int n) {
		StringBuilder builder = new StringBuilder();
		int a = 1;
		int b = 1;
		int sumFibonacci;

		builder.append(a).append(" ").append(b).append(" ");

		for (int i = 0; i < n; i++) {
			sumFibonacci = a + b;
			a = b;
			b = sumFibonacci;

			builder.append(sumFibonacci).append(" ");
		}

		return builder.toString();
	}

	public String generateFibonacci(int min, int max) {
		StringBuilder builder = new StringBuilder();
		int a = 1;
		int b = 1;
		int sumFibonacci;

		for (int i = 0; i < max; i++) {
			sumFibonacci = a + b;
			a = b;
			b = sumFibonacci;

			if (sumFibonacci > min && sumFibonacci < max) {
				builder.append(sumFibonacci).append(" ");
			}
		}
		return builder.toString();
	}

}
