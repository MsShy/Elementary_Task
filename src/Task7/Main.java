package Task7;

import exception.ParameterValidateException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = null;

	public static void main(String[] args) {

		try {
			 scanner = new Scanner(System.in);

			System.out.println("input n:");
			int n = scanner.nextInt();


			System.out.println("input m:");
			double m = scanner.nextDouble();

			NumericSequence sequence;
			try {
				sequence = new NumericSequence(n, m);
				System.out.println(sequence.printNumbersSeries());
			} catch (ParameterValidateException e) {
				System.out.println(e.getMessage());
			}

		} catch (InputMismatchException e) {
			System.out.println("incorrect value, need number");

		}
	}



}