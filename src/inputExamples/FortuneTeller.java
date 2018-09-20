package inputExamples;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		weight = input.nextInt();
		
		int age = -999;
		System.out.println("What is your age?");
		age = input.nextInt();
		
		int luckyNum = -999;
		System.out.println("What is your lucky number?");
		luckyNum = input.nextInt();
		
		System.out.println("In the future... ");
		System.out.println("I see... ");
		System.out.println(luckyNum + " years from now... ");
		System.out.println("You will reside number " + age + weight + " at the old folks home");

	}

}
