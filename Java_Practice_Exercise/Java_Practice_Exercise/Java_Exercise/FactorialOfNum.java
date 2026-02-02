package Java_Exercise;

public class FactorialOfNum {
	private int num;
	
	public FactorialOfNum(int num) {
		this.num = num;
	}
	
	public int FuncFactorialOfNum (int num) {
		if(num <= 1) return 1;
		return num*FuncFactorialOfNum(num - 1);
	}
	
	public void PrintFactorialOfNum() {
		int temp_num = FuncFactorialOfNum(num);
		System.out.println(temp_num);
	}
}
