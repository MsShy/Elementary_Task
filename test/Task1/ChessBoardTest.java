package Task1;

import exception.ParameterValidateException;
import org.junit.Test;

import static org.junit.Assert.*;


public class ChessBoardTest {

	ChessBoard chessBoard = new ChessBoard();

	@Test
	public void testPrintChessBoard() throws ParameterValidateException {
		chessBoard.setHeight(5);
		chessBoard.setWidth(4);
		String expectResult = "* * \n" +
				" * *\n" +
				"* * \n" +
				" * *\n" +
				"* * \n";
		String actualResult = chessBoard.printChessBoard();

		assertEquals(expectResult, actualResult);
	}

	@Test(expected = ParameterValidateException.class)
	public void testSetHeight() throws ParameterValidateException {
		chessBoard.setHeight(0);
	}

	@Test(expected = ParameterValidateException.class)
	public void testSetWidth() throws ParameterValidateException {
		chessBoard.setWidth(0);
	}
	
}