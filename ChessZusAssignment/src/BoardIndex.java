
public class BoardIndex {
	
	private int file;
	private int rank;


	public BoardIndex(int file, int rank) {
		super();
		this.file = file;
		this.rank = rank;
	}
	
	public int getFile() {
		return file;
	}


	public void setFile(int file) {
		this.file = file;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}

}
