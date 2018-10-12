package objectOriented;

public class Bank {
	private double balance;
	private int account;
	private double interest;

	public Bank() {
		balance = -999.99;
		account = -999999;
		interest = -999.99;
	}

	public Bank(double newBalance, int newAccount, double newInterest) {
		balance = newBalance;
		account = newAccount;
		interest = newInterest;
	}

	public double getBalance() {
		return balance;
	}

	public void setDeposit(double deposit) {
		balance = balance + deposit;
	}

	public void setWithdraw(double withdraw) {
		balance = balance - withdraw;

	}

	public void setBalance(double newBalance) {
		balance= newBalance;
	}

	public double getaddinterest() {
		return interest;
	}

	public void setaddinterest(double interest) {
		balance = balance * interest;
	}

	public void financecharge(double charge) {
		double newBalance = balance - charge;
	}

}
