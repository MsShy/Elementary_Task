package Task1;

import exception.ParameterValidateException;

import java.util.Scanner;
import java.util.logging.Logger;

public class ChessBoardMaker {


	private static Scanner scanner = null;

	public static void main(String[] args) {


		ChessBoard chessBoard = new ChessBoard();
		try {
			int height = getNumber("enter height:");
			chessBoard.setHeight(height);
			int width = getNumber("enter width:");
			chessBoard.setWidth(width);
			System.out.println(chessBoard.printChessBoard());
		} catch (ParameterValidateException e) {
			System.out.println(e.getMessage());
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
