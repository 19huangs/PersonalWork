package objectOriented;

import java.util.Scanner;

public class FilltheSandboxTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilltheSandbox aafreen = new FilltheSandbox();
		aafreen.sayHouse();
		
		//version 2 below
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		double num = input.nextDouble();
		System.out.println("What is the width?");
		double num2 = input.nextDouble();
		System.out.println("What is the depth?");
		double num3 = input.nextDouble();
		System.out.println("What is the amount of sand that can be transported in an hour?");
		double num4 = input.nextDouble();
		
		aafreen.sayHouse2(num, num2, num3, num4);
		
		//version 3 below
		System.out.println("What is the length?");
		double length = input.nextDouble();
		System.out.println("What is the width?");
		double width = input.nextDouble();
		System.out.println("What is the depth?");
		double depth = input.nextDouble();
		System.out.println("What is the amount of sand that can be transported in an hour?");
		double sand = input.nextDouble();
		
		double time = (length*width*depth)/sand;
		
		double hours = aafreen.returnHours(time);
		System.out.println("Time it takes: " + hours + " hours");
	}

}
