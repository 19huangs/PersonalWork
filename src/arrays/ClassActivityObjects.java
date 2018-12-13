package arrays;
import java.util.Scanner;
import java.util.Random;
public class ClassActivityObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random ();

		
//Declare 100 Rectangle Objects
		final int numObjects=10;
		RectangleClass [] area = new RectangleClass [numObjects];
		
		int randomNum =0;
		int randomNum2 =0;
		int min = 10; 
		int max = 56;
		int smallest = 3136;
		int smallestIndex=0;
		for (int counter = 0; counter < area.length; counter++)
		{
			randomNum = min + bob.nextInt(max-min+1);
			randomNum2 = min + bob.nextInt(max-min+1);
			
			RectangleClass aafreen = new RectangleClass(randomNum, randomNum2);
			
			System.out.println("Length: " + aafreen.getLength() + " Width: " + aafreen.getWidth() + " Area: " + aafreen.area());
			
			if (aafreen.area() < smallest)
			{
				smallest = aafreen.area();
				smallestIndex = counter;
			}
		}	
		System.out.println("Smallest area: " + smallest);
		System.out.println("Smallest Index: " + smallestIndex);
	}
}
