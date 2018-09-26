package mathOperators;
import java.util.Scanner;
public class makeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double change = 999.99;
		double centchange = 999.99;
		int dollars = 999;
		int quarters = 999;
		int dimes = 999;
		int nickles = 999;
		int pennies = 999;
		
		final int DOLLARS = 100;
		final int QUARTERS = 25;
		final int DIMES = 10;
		final int NICKLES = 5;
		final int PENNIES = 1;

		Scanner input = new Scanner(System.in);
		
		System.out.println("How much change do you want");
		change = input.nextDouble();
		System.out.println("You want $" + change + " back");
		
		
		centchange = change * (100);
		dollars = (int)centchange/DOLLARS;
		quarters = ((int) ((int) (centchange - dollars *DOLLARS)/QUARTERS);
		dimes = (int)(centchange - dollars *DOLLARS - quarters *QUARTERS)/NICKLES;
		
		nickles = (int)centchange/DIMES;
		pennies = (int)centchange/PENNIES;
		
		System.out.println("You will receive " + dollars + " dollars, " + quarters + " quarters, "  + dimes + " dimes, " + nickles + " nickles, and  " + pennies + " pennies");
				
		
		
		
		
		
		
		
		
	}

}
