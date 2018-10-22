package Task2;

import exception.ParameterValidateException;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		try {
			EnvelopeMaker.runMakeEnvelopers();
			EnvelopeMaker.runMakeEnvelopers();
		} catch (ParameterValidateException e) {
			System.out.println(e.getMessage());
		}
	}
}
