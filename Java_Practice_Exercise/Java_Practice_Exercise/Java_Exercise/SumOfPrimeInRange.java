package Java_Exercise;

public class SumOfPrimeInRange {
	private int range;
	
	public SumOfPrimeInRange(int num) {
		this.range = num;
	}
	
	public boolean isPrime (int num) {
		if(num <= 1) return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
	
	public int FuncSumOfPrimeInRange (int num) {
		if(num <= 1) return 0;
		
		int sum = 0;
		for(int i = 2; i <= this.range; i++) {
			if(isPrime(i)) sum = sum + i;
		}
		
		int tmpNum = 0;
		if(isPrime(num)) tmpNum = num;
		
		return tmpNum  + FuncSumOfPrimeInRange(num - 1);
	}
	
	public void PrintSumOfPrimeInRange() {
		System.out.println(FuncSumOfPrimeInRange(this.range));
	}
}
