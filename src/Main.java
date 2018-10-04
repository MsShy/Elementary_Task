import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		int min;
		int max;


		Scanner scanner = new Scanner(System.in);

		System.out.println("enter min:");
		min = scanner.nextInt();
		System.out.println("enter max:");
		max = scanner.nextInt();


		HappyTicket ticket = new HappyTicket(min, max);
		ticket.checkWinner();
		HappyTicket ticket2 = new HappyTicket();

	}


}