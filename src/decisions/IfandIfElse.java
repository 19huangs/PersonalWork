package decisions;
import java.util.Scanner;
public class IfandIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		final int BASE = 200;
		/*int numMuseum = -999;
		int numZoo = -999;
		final int TOUR = 40 * numMuseum;
		final int ADVENTURE = 35 * numZoo;*/
		double cost = -999;
		
		System.out.println("How many people are going on the trip?");
		double people = -999;
		people = input.nextDouble();
		System.out.println("Zoo activity?");
		boolean zoo = input.nextBoolean();
		System.out.println("Museum activity?");
		boolean museum = input.nextBoolean();
		
		if (zoo==true && museum==true)
		{
			cost = (BASE*people) + (people*35) + (people*40);
			System.out.println("Total Cost: $" + cost);
		}
		if (zoo==true && museum!=true)
		{

			cost = (BASE*people) + (people*35);
			System.out.println("Total Cost: $" + cost);
		}
		
		if (zoo!=true && museum==true)
		{
			cost = (BASE*people) + (people*40);
			System.out.println("Total Cost: $" + cost);
		}
		
		if (zoo!=true && museum!=true)
		{
			cost = (BASE*people);
			System.out.println("Total Cost: $" + cost);
		}
		
	}

}
