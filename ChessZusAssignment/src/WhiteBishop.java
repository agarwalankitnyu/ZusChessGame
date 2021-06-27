
public class WhiteBishop extends Piece {

	@Override
	public boolean canMove(Square start, Square end) {
		//check if the bishop is eligible to move to the new location
		return Math.abs(end.getBoardIndex().getFile() - start.getBoardIndex().getFile()) == Math
				.abs(end.getBoardIndex().getRank() - start.getBoardIndex().getRank());
	}

}
