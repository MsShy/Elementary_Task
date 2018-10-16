package Task7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		/*List<Integer> list = NumericSequence.countRow(2, 6);
		NumericSequence.printNumbersSeries(list);*/

		//	NumericSequence numberSeries = new NumericSequence(5, 9.5);
		//	numberSeries.printNumbersSeries();

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("input n:");

			int n = scanner.nextInt();


			System.out.println("input m:");
			double m = scanner.nextDouble();
			while (!checkValidation(n, m)) {
				System.out.println("input n:");
				n = scanner.nextInt();
				System.out.println("input m:");
				m = scanner.nextInt();
			}

			NumericSequence sequence = new NumericSequence(n, m);
			System.out.println(sequence.printNumbersSeries());

		} catch (InputMismatchException e) {
			System.out.println("incorrect value, need number");

		}

	}

	private static boolean checkValidation(int n, double m) {

		return !(n < 0 || m < 0);
	}

}