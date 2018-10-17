package decisions;

import java.util.Scanner;

public class HomeworkProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// 1. Age Decision Problem
		/* System.out.println("What is your age?");
		double age = input.nextDouble();

		System.out.println("I hope you are having a great day!");

		if (age <= 17) {
			System.out.println("You are getting an A in this class");
		}*/
		
		// 2. Grade Percentage Problem
		
		
		System.out.println("What is your first test grade out of 100");
		double first = input.nextDouble();
		System.out.println("What is your second test grade out of 100");
		double second = input.nextDouble();
		System.out.println("What is your third test grade out of 100");
		double third = input.nextDouble();
		double sum = (first+second+third);
		
		System.out.println("Did you get extra credit?");
		boolean extra = input.nextBoolean();
		
		if (extra==true){
			System.out.println("How much extra credit?");
			double extraNumber = input.nextDouble();
			sum = sum + extraNumber;
		}
	
		sum = (sum/300)*100;
		System.out.println("Average: " + sum + "%");
	}

}
