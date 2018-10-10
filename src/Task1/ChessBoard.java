package Task1;

public class ChessBoard {

	public char asterisk = '*';  //const
	public char space = ' ';


	private int height;
	private int width;

	public ChessBoard(int height, int width) {
		this.height=height;
		this.width=width;
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

	public void printChessBoard(){
		char[][] arr=makeBoard();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printInstruction(){//todo
		System.out.println("Input in");
	}

}