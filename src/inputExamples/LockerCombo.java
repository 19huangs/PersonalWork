package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number of your lock?");
		first = input.nextInt();
		
		int second = -999;
		System.out.println("What is the second number of your lock?");
		second = input.nextInt();
		
		int third = -999;
		System.out.println("What is the third number of your lock?");
		third = input.nextInt();
		
		System.out.println("Your lock is " + first + "-" + second + "-" + third);
	}

}
