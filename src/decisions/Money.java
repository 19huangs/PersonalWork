package decisions;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		double age = input.nextDouble();
		System.out.println("What is your GPA?");
		double GPA = input.nextDouble();
		
		if ((age + GPA) > 20) {
			double money = 250 + 30;
		}
		double money = 30;
		System.out.println("You get: $" + money);
	}

}
