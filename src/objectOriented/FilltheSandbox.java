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
		System.out.println("The length is: " + num + " feet"); //check if you need this part
		System.out.println("The width is: " + num2 + " feet");
		System.out.println("The depth is: " + num3 + " feet");
		System.out.println("The amount of sand that can be transported in an hour is: " + num4 + " cubic feet"); 
	}

	public double returnHours(double hours) {
		return hours;
	}
}
