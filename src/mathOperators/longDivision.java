package mathOperators;
import java.util.Scanner;
public class longDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 999;
		int divisor = 999;
		int result = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number?");
		dividend = input.nextInt();
		System.out.println("What is your second number?");
		divisor = input.nextInt();
		result = dividend%divisor;
		System.out.println("Your answer is " + (dividend/divisor) + "r" + result);
	}

}
