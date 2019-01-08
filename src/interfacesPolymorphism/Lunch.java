package interfacesPolymorphism;

public class Lunch implements Meal  {
	private boolean school;
	private int prepTime;
	private int calories;
	
	public Lunch()
	{
		school = true;
		prepTime = 10;
		calories =500;
	}
	
	public boolean hadEggs()
	{
		return true; 
	}
	public int getCalories()
	{
		return calories;
	}
	public String toString()
	{
		return ("School: " + school + ", " + "Prep Time: " + prepTime + ", " +"Calories: " + calories);
	}
	
	public boolean equals (Object anObject)
	{
		if (this.toString().equals(anObject.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
