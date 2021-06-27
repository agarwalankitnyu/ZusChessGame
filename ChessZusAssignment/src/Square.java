
public class Square {
	private Piece piece;
	private BoardIndex boardIndex;
	
	public Square(Piece piece, BoardIndex boardIndex) {
		super();
		this.piece = piece;
		this.setBoardIndex(boardIndex);
	}

	
	
	public Piece getPiece() {
		return piece;
	}


	public void setPiece(Piece piece) {
		this.piece = piece;
	}



	public BoardIndex getBoardIndex() {
		return boardIndex;
	}



	public void setBoardIndex(BoardIndex boardIndex) {
		this.boardIndex = boardIndex;
	}




}
