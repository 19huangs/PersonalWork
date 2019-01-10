package interfacesPolymorphism;

public class Dinner implements Meal {
	private String protein;
	private String dessert;
	private int calories;
	
	public Dinner()
	{
		protein = "Steak";
		dessert = "brownie";
		calories = 500;
	}
	public String forDessert()
	{
		return dessert;
	}
	public int getCalories ()
	{
		return calories;
	}
	public String toString()
	{
		return ("Protein: " + protein + ", " + "Dessert: " + dessert + ", " +"Calories: " + calories);
	}
}
