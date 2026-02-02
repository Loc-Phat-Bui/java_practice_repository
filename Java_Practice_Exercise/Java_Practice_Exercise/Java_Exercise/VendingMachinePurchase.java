package Java_Exercise;

public class VendingMachinePurchase {
	private int[] products = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public void FuncVendingMachinePurchase(int productIndex, int funds) throws VendingInsufficientFundsException{
		if(productIndex < 0 || productIndex > 9) {
			throw new VendingInsufficientFundsException("product");
		}
		if(products[productIndex] > funds) {
			throw new VendingInsufficientFundsException("funds");
		}
		else System.out.println("Purchase Successful");
	}
}
