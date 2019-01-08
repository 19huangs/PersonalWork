package interfacesPolymorphism;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class MealTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		ArrayList <Meal>cat = new ArrayList <Meal> ();
		Random bob = new Random ();
		
		int max = 3;
		int min = 1;
		int randomNum = 0;
		for (int counter = 0; counter < 25; counter++)
		{
			randomNum = min + bob.nextInt(max-min+1);
			if (randomNum == 1)
			{
				cat.add(new Breakfast (true, "Juice", 500));
			}
			if (randomNum == 2)
			{
				cat.add(new Lunch ());
			}
			if (randomNum == 3)
			{
				cat.add(new Dinner ());
			}
		}
		double total = 0;
		int times = 0;
		for (int counter = 0; counter < 25; counter++)
		{
			total += cat.get(counter).getCalories();
			if (cat.get(counter) instanceof Breakfast)
			{
				times++;
			}
			
			if (cat.get(counter) instanceof Lunch)
			{
				System.out.println(cat.get(counter).toString());
			}
			
			if (cat.get(counter) instanceof Dinner)
			{
				Dinner tempDinner = (Dinner) cat.get(counter);
				System.out.println("Dessert: " + tempDinner.forDessert());
				
			}
		}
		System.out.println("Number of breakfasts had eggs: " + times);
		System.out.println("Average Calories: " + total/25);
	}

}
