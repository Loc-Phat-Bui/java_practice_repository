package Java_Exercise;

import java.util.Arrays;

public class FindMissingNumInArray {
	int[] numArray;
	short arrLength;
	
	public FindMissingNumInArray(int[] arr) {
		this.arrLength = (short)arr.length;
		this.numArray = new int[this.arrLength]; 
		
		for (short i = 0; i < this.arrLength; i++) {
			this.numArray[i] = arr[i];
		}
	}
	
	public void PrintMissingNumInArray() {
		int[] sortArr = this.numArray;
		Arrays.sort(sortArr);
		
		short templArrLength = (short)sortArr[arrLength - 1];
		int[] tempArr = new int[templArrLength];
		
		int j = 0;
		for (short i = 0; i < templArrLength; i++) {
			if(sortArr[j] == i + 1) {
				tempArr[i] = sortArr[j];
				j++;
			} else {
				tempArr[i] = -1;
			}
		}
		
		for (short i = 0; i < templArrLength; i++) {
			if(tempArr[i] == -1) {
				System.out.println(i + 1);
			}
		}
	}
}
