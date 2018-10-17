package decisions;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("What is your age?"); int user = input.nextInt();
		 * int age = user; System.out.println(age != 16); System.out.println(age
		 * >= 16);
		 */

		/*
		 * System.out.println("What is your height?"); double height =
		 * input.nextDouble();
		 * 
		 * System.out.println("What is your shoesize?"); double shoe =
		 * input.nextDouble(); double sum = shoe + height; System.out.
		 * println("Is the sum of your shoe size and height greater than or equal to 26? \n"
		 * + (sum >= 26));
		 */

		/*
		 * System.out.println("What is your height?"); double height =
		 * input.nextDouble();
		 * 
		 * System.out.println("What is your shoesize?"); double shoe =
		 * input.nextDouble();
		 * 
		 * System.out.println(height < 62 && shoe > 9);
		 */

		System.out.println("How many pets do you have?");
		int pets = input.nextInt();

		System.out.println("How many cars fit in your garage?");
		int cars = input.nextInt();

		System.out.println(pets >= 5 || cars > 3);

	}

}
