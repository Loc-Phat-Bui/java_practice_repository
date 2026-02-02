package Java_Exercise;

public class ReverseStringRecursive {
	private String revString;
	
	public ReverseStringRecursive (String str) {
		this.revString = str;
	}
	
	public String FuncReverseString(String str) {
		if(str.isEmpty()) return str;
		
		return FuncReverseString(str.substring(1)) + str.charAt(0);
	}
	
	public void PrintReverseString() {
		System.out.println(FuncReverseString(revString));
	}
}
