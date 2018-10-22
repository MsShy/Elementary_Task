package Task5;

import exception.ParameterValidateException;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = null;

	public static void main(String[] args) throws ParameterValidateException {




		String line = read();
		int number;
		if(line.matches("\\d+")) {
			line = line.replaceAll("^0+", "");

		}
		//System.out.println(line);
		//number= Integer.parseInt(line);

		//NumberWritter numberWritter=new NumberWritter(number);

		NumberWritter numberWritter=new NumberWritter(line);

		System.out.println("fff"+numberWritter.show());


		String nol="00";
		System.out.println("parse"+Integer.parseInt(nol));

	}




		public static String read() {
			scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			return line;
		}
}
