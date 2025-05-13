package projec1;

public class Had {
	public static void main(String[] args) {
		Bank bank = new Bank();
		//greetCustomer();
		bank.deposit(500);
		System.out.println(bank.currentBalance());
		bank.withdrawal(300);
		System.out.println(bank.currentBalance());
		
	}}


