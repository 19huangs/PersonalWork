package interfacesPolymorphism;

public class Breakfast implements Meal
{
	private boolean eggs;
	private String drink;
	private int calories;
	
	public Breakfast()
	{
		eggs = true;
		drink = "Water";
		calories = 500;
	}
	public Breakfast(Boolean xEggs, String xDrink, int xCalories)
	{
		eggs = xEggs;
		drink = xDrink;
		calories = xCalories;
	}
	
	public boolean getEggs()
	{
		return eggs;
	}
	public int getCalories()
	{
		return calories;
	}
	public String toString()
	{
		return ("Eggs: " + eggs + ", " + "Drinks: " + drink + ", " +"Calories: " + calories);
	}
	
	public boolean equals (Object anObject)
	{
		if(this.toString().equals(anObject.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public Object clone  ()
	{
		return new Breakfast(eggs, drink, calories);
	}
	
}

