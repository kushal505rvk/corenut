package projec1;

public class Bank {
	
    
	public int currentBalance = 10000;
	
	public static void greetCustomer() {
	
		System.out.println("Hello, Welcome to our Bank");
	}
	public  void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount deposited successful");
	}
	public void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount withdrawal successful");

	}
	public int currentBalance() {
		return currentBalance;
	}
	
	public static void main(String[] args) {
		int number = -10;
		if (number > 5) {
		    System.out.println("Number is greater than 5 this is if condition");
		}
		while(number > 5) {
		    System.out.println("Number is greater than 5");
		    break;
		}  
	        
	
	}
}
