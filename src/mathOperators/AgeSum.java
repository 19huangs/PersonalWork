package mathOperators;

import java.util.Scanner;

public class AgeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1 = -999;
		int age2 = -999;
		int age3 = -999;
		int sum = -999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the age of friend 1?");
		age1 = input.nextInt();
		
		System.out.println("What is the age of friend 2?");
		age2 = input.nextInt();
		
		System.out.println("What is the age of friend 3?");
		age3 = input.nextInt();
		
		sum = age1 + age2 + age3;
		
		System.out.println("The sum of the friends' ages is " + sum);
	}

}
