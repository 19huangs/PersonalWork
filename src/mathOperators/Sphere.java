package mathOperators;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = -999.99;
		double sphere = -999.99;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius of the sphere?");
		
		radius = input.nextDouble();
		sphere = (radius * radius * radius) * (Math.PI) * (4.0/3.0);
		
		System.out.println("The volume of the sphere is " + sphere);
	}

}
