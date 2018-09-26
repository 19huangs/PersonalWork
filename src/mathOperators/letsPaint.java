package mathOperators;

import java.util.Scanner;

public class letsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int height = 8;
		int width = 999;
		int length = 999;
		double area = 999;
		double gallons = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		length = input.nextInt();
		
		System.out.println("What is the width?");
		width = input.nextInt();
		area = (8*2*width) + (2*8*length);
		gallons = (area/150);
		System.out.println("The area of wall space needed to be painted is " + area);
		System.out.println("You need " + gallons + " gallons to cover the whole room");
		
	
	}

}
