package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessBoardMaker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("enter height:");
			int height = scanner.nextInt();
			System.out.println("enter width:");
			int width = scanner.nextInt();
			if(height>0 && width>0){

				ChessBoard chessBoard = new ChessBoard(height, width);
				chessBoard.printChessBoard();
			}
		} catch (InputMismatchException e) {
			System.out.println("Incorrect value.");
			ChessBoard.printInstruction();
		}


	}
}
