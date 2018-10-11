package objectOriented;

import java.util.Scanner;

public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle daisy = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectangle? ");
		double length = input.nextDouble();
		System.out.println("What is the width of the rectangle? ");
		double width = input.nextDouble();

		daisy = new Rectangle(length, width);
		System.out.println("Rectangle perimeter: " + daisy.Perimeter());
		System.out.println("Rectangle area: " + daisy.Area());
		
		Circle daaisy = new Circle();
		System.out.println("What is the radius of the circle?");
		double radius = input.nextDouble();
		
		daaisy = new Circle(radius);
		System.out.println("Rectangle perimeter: " + daaisy.Circumfrence());
		System.out.println("Rectangle area: " + daaisy.Area());
		
		RightTriangle daaaisy = new RightTriangle();
		System.out.println("What is the base of the triangle?");
		double base = input.nextDouble();
		System.out.println("What is the height of the triangle?");
		double height = input.nextDouble();
		
		daaaisy = new RightTriangle(base, height);
		System.out.println("Triangle perimeter: " + daaaisy.perimeter());
		System.out.println("Triangle area: " + daaaisy.area());
	}
		
	
}
