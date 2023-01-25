package banking;

public class SavingsAccount extends BankAccount {


	SavingsAccount(String accNumber, String accName) {
		super(accNumber, accName);
	}

	
	public boolean deposit(double amount) {
		if (super.deposit(amount)) {
			return true;
		}
		return false;
	}


	public boolean withdraw(double amount) {
		if (super.withdraw(amount)) {
			return true;
		}
		return false;
	}



}
