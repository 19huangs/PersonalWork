package mathOperators;
import java.util.Scanner;
public class cuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 999;
		int length = 999;
		int radius = 999;
		double earn = 999.99;
		double area = 999;
		double fountain = 999.99;
		double difference = 999.99;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length in yards?");
		length = input.nextInt();
		System.out.println("That is " + (length * 3) + " feet");

		System.out.println("What is the width in yards?");
		width = input.nextInt();
		System.out.println("That is " + (width * 3) + " feet");
		
		System.out.println("What is the radius of the fountain in feet?");
		radius = input.nextInt();
		
		area = (length * 3) * (width * 3);
		fountain = radius * radius * Math.PI;
		difference = area - fountain;
		
		System.out.println("The area of grass to be cut is " + difference + " square feet");
		
		earn = (difference/100) * 1.25; 
		System.out.println("The amount owed is $" + earn);

		
	}

}
