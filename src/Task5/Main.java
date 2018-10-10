package Task5;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number;
		if(line.matches("\\d+")) {
			line = line.replaceAll("^0+", "");

		}
		number= Integer.parseInt(line);
		System.out.println(line.length());
		NumberWritter numberWritter=new NumberWritter(number);
		numberWritter.show();


	}
}
