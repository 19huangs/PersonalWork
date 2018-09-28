package mathOperators;
import java.util.Scanner;
public class pullSSNapart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		int SSN = 999;
		int length = 999;
		int last = 999;
		double gallons = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is the your SSN?");
		SSN = input.nextInt();
		
		System.out.println("It will take " + (18- age) + " years until you can vote");
		System.out.println("Your SSN is: " + SSN);
		
		last = SSN%10000;
		System.out.println("Last four digits of your SSN is: " + last);
		
	}

}
