package objectOriented;

import java.util.Scanner;

public class FilltheSandbox {
	public FilltheSandbox() {
	}

	public void sayHouse() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length (feet) of the sandbox?");
		double length = input.nextDouble();

		System.out.println("What is the width (feet) of the sandbox?");
		double width = input.nextDouble();

		System.out.println("What is the depth (feet) of the sandbox?");
		double depth = input.nextDouble();

		System.out.println("How much sand (cubic feet) can you transport in an hour?");
		double sand = input.nextDouble();

		double time = (length * width * depth) / sand;
		System.out.println("It takes " + time + " hours to fill the sandbox");

	}

	public void sayHouse2(double num, double num2, double num3, double num4) {
		double time = (num*num2*num3)/num4;
	}

	public double returnHours(double hours) {
		return hours;
	}
}
