/*
 * W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction. 
 */
public class InsufficientFundException extends RuntimeException{
	private String message;
	
	public InSufficientFundException(String message) {
		this.message = message;
	}
	public InSufficientFundException(Throwable cause, String message) {
		super(cause);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}

public class Account {
	private int balance = 3000;
	
	public int balance () {
		return balance;
	}
	
	public void withdraw (int amount) throws InSufficientFundException{
		if(amount > balance) {
			throw new InSufficientFundException(String.format("Current balance %d is less than requested amount %d", balance,amount));
		
		}
		balance = balance - amount;	
		}
	public void deposit(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount));
		}
	}
}
public class A_41_InSufficientFund {
	public static void main(String[] args) {
		Account acct = new Account();
		System.out.println("Current balance : "+ acct.balance());
		System.out.println("Withdrawing $200");
		acct.withdraw(200);
		System.out.println("Current balance : "+ acct.balance());
		acct.withdraw(3500);
	}
}
