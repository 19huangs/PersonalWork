package objectOriented;
import java.util.Scanner;
public class House {
	public House(){
	}
	public void sayMinutes() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		double length = input.nextDouble();
		
		System.out.println("What is the height");
		double Height = input.nextDouble();
		double area = length * Height;
		double time = area/ (200.0/60.0);
		
		System.out.println("The time it takes to paint this wall is: " + time);
		
	}	
}

