import java.util.Scanner;

public class ChessZusAssignment {

	private static String files = "abcdefgh";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter bishop location");
		String bishopLocation = scanner.nextLine();

		System.out.println("Enter rook location");
		String rookLocation = scanner.nextLine();

		System.out.println(bishopLocation + " " + rookLocation);

		BoardIndex bishopBoardIndex = new BoardIndex(files.indexOf(bishopLocation.charAt(0)),
				Character.getNumericValue(bishopLocation.charAt(1)) - 1);

		BoardIndex rookBoardIndex = new BoardIndex(files.indexOf(rookLocation.charAt(0)),
				Character.getNumericValue(rookLocation.charAt(1)) - 1);
		
		ZusGameEngine zusGameEngine = new ZusGameEngine(bishopBoardIndex, rookBoardIndex);
		
		zusGameEngine.playGame();


	}

}
