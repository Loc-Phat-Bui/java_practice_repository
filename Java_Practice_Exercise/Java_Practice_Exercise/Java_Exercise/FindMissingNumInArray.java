package Java_Exercise;

import java.util.Arrays;

public class FindMissingNumInArray {
	int[] numArray;
	short arrLength;
	
	public FindMissingNumInArray(int[] arr) {
		this.arrLength = (short)arr.length;
		this.numArray = Arrays.copyOf(arr, arrLength); 
	}
	
	public void PrintMissingNumInArray() {
		int n = this.arrLength + 1;
		
		long expectedSum = (long) (n*(n +1))/2;
		long actualSum = 0;
		
		for (int num : this.numArray) {
			actualSum += num;
	    }
		
		System.out.println((int) (expectedSum - actualSum));
	}
}
