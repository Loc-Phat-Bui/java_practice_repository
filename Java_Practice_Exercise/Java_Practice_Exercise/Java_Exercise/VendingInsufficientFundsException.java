package Java_Exercise;

public class VendingInsufficientFundsException extends Exception {
    public VendingInsufficientFundsException(String str) {
    	super(str.equals("product") ? "Product not found, Please choose other product" : 
            str.equals("funds")   ? "Insufficient Funds, Please choose other product" : 
            "General Vending Error");
    }
}