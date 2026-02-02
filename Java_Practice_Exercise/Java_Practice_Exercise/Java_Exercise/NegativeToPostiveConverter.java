package Java_Exercise;

public class NegativeToPostiveConverter {
	private int negNum;
	
	public NegativeToPostiveConverter(int negNum) {
		this.negNum = negNum;
	}
	
	public int NegativeToPostiveConverterFunc() {
		return Math.abs(this.negNum);
	}
}
