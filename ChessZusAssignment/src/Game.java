
public class Game {
	
	private Board board;

	public Game() {
		board = new Board();
	}
	
	public Board getBoard() {
		return board;
	}
	
	
	public boolean makeMove(Square start,Square end)
    {
        Piece sourcePiece = start.getPiece();
        
        //source piece exists?
        if (sourcePiece == null) {
            return false;
        }

  
        // valid move?
        if (!sourcePiece.canMove(start, end)) {
            return false;
        }
  
        // kill?
        Piece destPiece = end.getPiece();
        if (destPiece != null) {
            destPiece.setKilled(true);
        }
  
  
        // move piece from the start box to end box
        end.setPiece(start.getPiece());
        start.setPiece(null);
  
        return true;
    }

}
