package Task1;

import exception.ParameterValidateException;
import validation.Validator;

public class ChessBoard {

	public char asterisk = '*';
	public char space = ' ';

	private int height;
	private int width;

	public ChessBoard() {
		this.height = height;
		this.width = width;
	}

	private char[][] makeBoard() {

		char[][] arr = new char[height][width];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
					arr[i][j] = asterisk;
				} else {
					arr[i][j] = space;
				}
			}
		}
		return arr;
	}

	public String printChessBoard() {
		char[][] arr = makeBoard();

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				builder.append(arr[i][j]);
			}
			builder.append("\n");
		}
		return builder.toString();

	}

	public void setHeight(final int height) throws ParameterValidateException {
		Validator.isPositive(height, "height of chessboard");
		this.height = height;
	}

	public void setWidth(final int width) throws ParameterValidateException {
		Validator.isPositive(width, "width of chessboard");
		this.width = width;
	}


}