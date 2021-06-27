
public abstract class Piece {

	private boolean killed = false;

	public boolean isKilled() {
		return this.killed;
	}

	public void setKilled(boolean killed) {
		this.killed = killed;
	}

	//check if the piece can move from the current square to the new location
	public abstract boolean canMove(Square start, Square end);
}
