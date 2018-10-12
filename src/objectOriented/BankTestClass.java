package objectOriented;
import java.util.Scanner;
public class BankTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank savingsaccount = new Bank ();
		Scanner input = new Scanner (System.in);
		System.out.println("What is your savings balance?");
		double balance = input.nextDouble();
		System.out.println("What is your savings account number?");
		int number = input.nextInt();
		System.out.println("What is the savings interest rate?");
		double rate = input.nextDouble();
		
		savingsaccount.setBalance(balance);
		savingsaccount.setDeposit(100.00);
		System.out.println("Balance: " + savingsaccount.getBalance() + "," + " Account Number: "+ number + "," + " Interest Rate: " + rate );
		
		Bank checkingaccount = new Bank ();
		double interest = 0.18;
		System.out.println("What is your checkings balance?");
		double balance2 = input.nextDouble();
		System.out.println("What is your checkings account number?");
		int number2 = input.nextInt();
		System.out.println("What is the checkings interest rate?");
		double rate2 = input.nextDouble();
		
		
		checkingaccount.setaddinterest(0.18);
		checkingaccount.setBalance(balance2);
		checkingaccount.setWithdraw(1000.00);
		System.out.println("Balance: " + checkingaccount.getBalance() + "," + " Account Number: "+ number2 + "," + " Interest Rate: " + checkingaccount.getaddinterest() + ",");
	}

}
