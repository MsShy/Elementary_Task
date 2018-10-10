package Task6;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) throws Exception {
		int min;
		int max;


		System.out.println("enter min:");
		min = LuckyTicket.checkValidation(scanner);

		if (min == -1) {
			LuckyTicket.printInstruction();
		} else {
			System.out.println("enter max:");
			max = LuckyTicket.checkValidation(scanner);
			if (max == -1) {
				LuckyTicket.printInstruction();
			} else if (min > max) {
				System.out.println("Min con not be more then Max number of ticket");
				LuckyTicket.printInstruction();
			} else if (min == max) {
				System.out.println("Min can not be equally Max number of ticket");
				LuckyTicket.printInstruction();
			} else{
				LuckyTicket ticket = new LuckyTicket(min, max);
				ticket.printWinner();

			}
		}


	}
}