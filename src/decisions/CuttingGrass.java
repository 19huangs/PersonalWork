package decisions;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the yard in feet?");
		double length = input.nextDouble();
		System.out.println("What is the width of the yard in feet?");
		double width = input.nextDouble();

		double pay = 0.0;
		double area = length * width;
		if (area > 100.0);
		{
			pay = area / 100.0;
		}

		System.out.println("What is the radius of the backyard in feet?");
		double radius = input.nextDouble();
		double pay2 = 0.0;
		double area2 = radius * radius * Math.PI;
		if (area2 > 75.0) {
			pay2 = (area2 / 75.0) * 1.50;
		}

		double total = pay + pay2;
		System.out.println("Total Pay: $" + total);

	}

}
