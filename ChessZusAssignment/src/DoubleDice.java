
public class DoubleDice {

	private int D1;
	private int D2;
	
	public DoubleDice(int D1, int D2) {
		super();
		this.D1 = D1;
		this.D2 = D2;
	}
	
	public int getDice1Roll() {
		return D1;
	}

	public int getDice2Roll() {
		return D2;
	}
	
	@Override
	public String toString() {
		return "DoubleDiceRoll [Dice 1=" + D1 + ", Dice 2=" + D2 + "]";
	}

}
