package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/* System.out.println("What is test score 1?");
		double score1 = input.nextDouble();
		System.out.println("What is test score 2?");
		double score2 = input.nextDouble();

		if (score1 > score2) {
			System.out.println("Great Job" + (score1 - score2));
		}
		System.out.println("Have a Nice Day!");*/
		
		System.out.println("What is your first number?");
		int number1 =input.nextInt();
		System.out.println("What is your second number?");
		int number2 =input.nextInt();
		System.out.println("What is your third number?");
		int number3 =input.nextInt();
		
		if (number1>number2 && number1>number2)
		{
			System.out.println("Biggest integer: " + number1);
		}
		
		if (number2>number1 && number2>number3)
		{
			System.out.println("Biggest integer: " + number2);
		}
		
		
		if (number3>number1 && number3>number2)
		{
			System.out.println("Biggest integer: " + number3);
		}
		
		
		
	}

}
