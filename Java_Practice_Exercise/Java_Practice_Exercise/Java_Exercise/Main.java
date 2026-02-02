package Java_Exercise;

public class Main {
	public static void main(String[] args) {
		
		
		/*
		** 
		** Variable, Dicision and Loop 
		**   
		**/
		System.out.println("Ex: Variable, Dicision and Loop");
		// No 1
		FactorialOfNum facNum = new FactorialOfNum(10);
		facNum.PrintFactorialOfNum();
		//No 2
		PalindromeStringRecursive palidStr = new PalindromeStringRecursive("ABCDCBA");
		palidStr.PrintStringPalidromeBool();
		//No 3
		ReverseStringRecursive revStr = new ReverseStringRecursive("Welcome to Agest");
		revStr.PrintReverseString();
		/*
		** 
		** Array and List
		**   
		**/
		System.out.println("Ex: Array and List");
		// No 1
		SumOfTwoPrimeNum sum = new SumOfTwoPrimeNum(18);
		sum.PrintSumOfTwoPrimeNum();
		// No 2
		String[] arrList = {"apple", "banana", "cherry"};
		FindStringInList strList = new FindStringInList(arrList);
		strList.PrintStringInListBool("banana");
		// No 3
		SumOfPrimeInRange range = new SumOfPrimeInRange(5);
		range.PrintSumOfPrimeInRange();
		// No 4
		/*
		** 
		** Error Handling
		**   
		**/
		System.out.println("Ex: Error Handling");
		// No 1
		VendingMachinePurchase vendingPurchase = new VendingMachinePurchase();
		try {
	        vendingPurchase.FuncVendingMachinePurchase(1, 3);
	    } catch (VendingInsufficientFundsException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
		// No 2
		CheckVowel checkStr = new CheckVowel("Welcome to Agest");
		try {
			checkStr.CheckVowelsInString();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		checkStr.setStr("Myth.");
		try {
			checkStr.CheckVowelsInString();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		/*
		** 
		** Others
		**   
		**/
		NegativeToPostiveConverter negNum = new NegativeToPostiveConverter(-123);
		System.out.println(negNum.NegativeToPostiveConverterFunc());
		
		int[] array = {4, 3, 8, 7, 5, 2, 6};
		FindMissingNumInArray numArr = new FindMissingNumInArray(array);
		
		numArr.PrintMissingNumInArray();
		
		
		
	}
}
