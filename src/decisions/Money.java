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
		double money = 30;
		if ((age + GPA) >= 20) {
			money = 250;
		}
		System.out.println("You get: $" + money);
	}

}
