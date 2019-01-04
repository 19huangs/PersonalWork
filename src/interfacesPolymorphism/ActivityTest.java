package interfacesPolymorphism;
import java.util.Scanner;
public class ActivityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		/*System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("Width: ");
		int width = input.nextInt();
		
		Shape bob = new Rectangle (length, width);
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		
		System.out.println("Radius: ");
		int radius = input.nextInt();
		Shape bobb = new Circle (radius);
		
		System.out.println("Perimeter: " + bobb.perimeter());
		System.out.println("Area: " + bobb.area());
		}*/
		
		System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("Width: ");
		int width = input.nextInt();
		
		Rectangle bob = new Rectangle (length, width);
		Shape bobb = new Rectangle (length, width);
		
		
		bob.setLength(20);
		bob.setWidth(10);
		System.out.println(bob.area());
		System.out.println(bobb.area());
		
	}


}
