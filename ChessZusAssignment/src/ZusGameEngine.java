
public class ZusGameEngine {

	private static final String files = "abcdefgh";

	private BoardIndex bishopBoardIndex;

	private BoardIndex rookBoardIndex;

	private Game game;

	private Board board;

	// Initializes the game Engine
	public ZusGameEngine(BoardIndex bishopBoardIndex, BoardIndex rookBoardIndex) {
		super();
		this.bishopBoardIndex = bishopBoardIndex;
		this.rookBoardIndex = rookBoardIndex;
		this.game = new Game();
		this.board = this.game.getBoard();
	}

	// Method for playing the game according to rules provided by Zus.
	public void playGame() {

		// Create new White bishop object and set on the initial square
		WhiteBishop whiteBishop = new WhiteBishop();
		Square bishopSquare = board.getSquare(bishopBoardIndex);
		bishopSquare.setPiece(whiteBishop);

		// create new black Rook object and set it on the initial square
		BlackRook blackRook = new BlackRook();
		Square rookSquare = board.getSquare(rookBoardIndex);
		rookSquare.setPiece(blackRook);

		// Looping 15 times for 15 rounds of the game
		for (int i = 0; i < 15; i++) {

			System.out.println("Round: " + (i + 1));

			// Get the coin toss
			String coinToss = RandomTossAndDice.getCoinToss();
			System.out.println("CoinToss: " + coinToss);

			// Get the dice roll
			DoubleDice diceRoll = RandomTossAndDice.getDoubleDiceRoll();
			System.out.println(diceRoll);

			int diceRollSum = diceRoll.getDice1Roll() + diceRoll.getDice2Roll();

			// Calculating next location for the rook based on coin toss
			if (coinToss.equals("heads")) {
				// If heads, move rook up by increasing rank and if it reaches top most row, it
				// emerges from the bottom most row
				rookBoardIndex.setRank((rookBoardIndex.getRank() + diceRollSum) % 8);
			} else {
				// If tails, move rook right by increasing file and if it reaches right most
				// column, it emerges from the left.
				rookBoardIndex.setFile((rookBoardIndex.getFile() + diceRollSum) % 8);
			}
			//New Potential location of the rook
			Square rookSqaureAfterMove = board.getSquare(rookBoardIndex);
			
			//If move is successful, update the current location to new location
			if (game.makeMove(rookSquare, rookSqaureAfterMove)) {
				rookSquare = rookSqaureAfterMove;
			}

			System.out.println(
					"Rook location: " + files.charAt(rookBoardIndex.getFile()) + (rookBoardIndex.getRank() + 1));

			// After the move, check if bishop is captured
			if (whiteBishop.isKilled()) {
				System.out.println("Bishop Captured. Rook Wins!");
				break;
			}
			
			//After the move, check if bishop can capture rook.
			if (game.makeMove(bishopSquare, rookSquare)) {
				System.out.println("Rook Captred. Bishop Wins!");
				break;
			}

		}

		//After 15 rounds, if black rook is not captured, it wins.
		if (!blackRook.isKilled()) {
			System.out.println("Bishop was not able to capture rook. Rook Wins!");

		}

	}

}
