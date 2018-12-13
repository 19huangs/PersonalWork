package designingClasses;
import java.util.Scanner;
public class PileOJunkTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PileOJunk bob = new PileOJunk();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter an integer: ");
		int number2 = input.nextInt();
		
		System.out.println(bob.randomSum(number1,number2));
	}

}
