package banking;
public class BankAccount implements bankProcess {
	// BankAccount attributes
	private String accountNumber;
	private String accountName;
	private double balance;

	//contructor
	public BankAccount(String accNumber, String accName) {
		accountNumber = accNumber;
		accountName = accName;
		balance = 0;
	}
	
	/*
	  Returns the Account Name.
	  return accountName
	 */
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	//Balance
	double getBalance() {
		return balance;
	}

	//deposite
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		} else {
			return false;
		}
	}

	
	//witdraw
	public boolean withdraw(double amount) {
		if (amount > balance) {System.out.println("Low Balance!!");
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}
}