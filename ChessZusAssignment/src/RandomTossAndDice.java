import java.util.Random;

public class RandomTossAndDice {

	public static String getCoinToss() {
		Random r = new Random();
		boolean toinCoss = r.nextBoolean();
		if (toinCoss) {
			return "tails";
		} else {
			return "heads";
		}
	}
	
	public static DoubleDice getDoubleDiceRoll() {
		
		Random r = new Random();
		int low = 1;
		int high = 7;
		int D1 = r.nextInt(high-low) + low;
		int D2 = r.nextInt(high-low) + low;
		return new DoubleDice(D1,D2);
	}

}
