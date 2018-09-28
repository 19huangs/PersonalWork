package mathOperators;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = -999;
		int area = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall in feet?");
		width = input.nextInt();
		area = width * 8;
		System.out.println("The area of the wall is " + area + " feet squared.");
	}

}
