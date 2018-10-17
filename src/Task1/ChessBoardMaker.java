package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessBoardMaker {


	private static Scanner scanner = null;

	public static void main(String[] args) {

		int height = getNumber("enter height:");
		int width = getNumber("enter width:");

		if (validate(height, width)) {

			ChessBoard chessBoard = new ChessBoard(height, width);

			System.out.println(chessBoard.printChessBoard());
		} else {
			System.out.println("Not Validate");
		}


	}

	private static boolean validate(int height, int width) {

		if (height > 0 && width > 0) {
			return true;
		}

		return false;
	}


	private static int getNumber(String message) {
		while (true) {
			System.out.println(message);
			final String input = read();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Expected a numbe,try again " + e.getMessage());
			}
		}
	}

	public static String read() {
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
}
