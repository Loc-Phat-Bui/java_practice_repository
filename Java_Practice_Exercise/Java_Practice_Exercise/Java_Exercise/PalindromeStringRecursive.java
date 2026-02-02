package Java_Exercise;

public class PalindromeStringRecursive {
	private String palidStr;
	
	public PalindromeStringRecursive(String palidStr) {
		this.palidStr = palidStr;
	}
	
	public boolean isPalindromeRecursive (String str, int leftPos, int rightPos) {
		if(leftPos >= rightPos) return true;
		
		if (str.charAt(leftPos) != str.charAt(rightPos)) return false;
		
		return isPalindromeRecursive(str, leftPos + 1, rightPos - 1);
	}
	
	public void PrintStringPalidromeBool() {
		System.out.println(isPalindromeRecursive(palidStr, 0, palidStr.length() - 1));
	}
}
