package Java_Exercise;

public class CheckVowel {
	private String str;
	
	class NoVowelsException extends Exception {
		public NoVowelsException(String msg) {
			super(msg);
		}
	}
	
	public CheckVowel (String str) {
		this.str = str;
	}
	
	public void setStr (String str) {
		this.str = str;
	}
	
	public void CheckVowelsInString() throws NoVowelsException {
		if(this.str.matches(".*[aeiouAEIOU].*")) System.out.println("String \"" + this.str + "\" contains vowels");
		else throw new NoVowelsException("String \"" + this.str + "\" does not contain any vowels");
	}
}
