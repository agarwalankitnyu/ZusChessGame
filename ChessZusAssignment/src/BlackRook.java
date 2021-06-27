
public class BlackRook extends Piece {

	@Override
	public boolean canMove(Square start, Square end) {
		//check if the rook is eligible to move to new location
		return ((start.getBoardIndex().getFile() != end.getBoardIndex().getFile())
				&& (start.getBoardIndex().getRank() == end.getBoardIndex().getRank())
				|| (start.getBoardIndex().getFile() == end.getBoardIndex().getFile())
						&& (start.getBoardIndex().getRank() != end.getBoardIndex().getRank()));

	}

}
