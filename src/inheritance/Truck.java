package inheritance;

public class Truck extends Auto{
	private boolean fourWD;
	
	public Truck(boolean xFourWD)
	{
		fourWD = xFourWD;
	}
	public boolean getFourWD()
	{
		return fourWD;
	}
	public String toString()
	{
		return "Four Wheeled Truck: " + fourWD;
	}
	public boolean equals(Object anObject)
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

