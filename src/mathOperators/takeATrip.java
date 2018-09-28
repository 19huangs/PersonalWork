package mathOperators;
import java.util.Scanner;
public class takeATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance = 999.99;
		double MPG = 999.99;
		double money = 999.99;
		double gallons = 999.99;
		double average = 999.99;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the total distance?");
		distance = input.nextDouble();
		
		System.out.println("How many gallons of gas were used?");
		gallons = input.nextDouble();
		
		System.out.println("How much money was spent?");
		money = input.nextDouble();
		average = money/gallons;
		
		System.out.println("Average Cost: $" + average + " per gallon");
	
		
		
		
	}

}
