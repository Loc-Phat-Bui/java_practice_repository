package Java_Exercise;

public class SumOfTwoPrimeNum {
	int num;
	
	public SumOfTwoPrimeNum(int num) {
		this.num = num;
	}
	
	public boolean isPrime(int num) {
		if (num <= 1) return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}
	
	public void PrintSumOfTwoPrimeNum() {
		
        boolean found = false;

        for (int i = 2; i <= this.num / 2; i++) {
            if (isPrime(i) && isPrime(this.num - i)) {
                System.out.println(this.num + " = " + i + " + " + (this.num - i));
                found = true;
            }
        }
        
        if(!found) System.out.println("no prime number found");
	}
}
