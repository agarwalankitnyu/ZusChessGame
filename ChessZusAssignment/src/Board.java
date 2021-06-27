
public class Board {

	Square[][] squares;

	public Board() {
		this.resetBoard();
	}

	
	public Square getSquare(BoardIndex boardIndex) {

		return squares[boardIndex.getFile()][boardIndex.getRank()];
	}

	//Reset the board
	private void resetBoard() {
		squares = new Square[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				squares[i][j] = new Square(null, new BoardIndex(i, j));
			}
		}

	}

}
