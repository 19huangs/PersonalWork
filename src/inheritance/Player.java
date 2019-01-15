package inheritance;

public class Player {
	private int health;
	private double locX;
	private double locY;
	
	public Player()
	{
		health =0;
		locX = 0;
		locY=0;
	}
	
	public Player(int xHealth, double xLocX, double xLocY)
	{
		health =xHealth;
		locX = xLocX;
		locY=xLocY;
	}
	
	public int getHealth()
	{
		return health;
	}
	public double getLocX()
	{
		return locX;
	}
	public double getLocY()
	{
		return locY;
	}
	public void setHealth(int xHealth)
	{
		health =xHealth;
	}
	public void setLocX(double xLocX)
	{
		locX = xLocX;
	}
	public void setLocY( double xLocY)
	{
		locY=xLocY;
	}
	public void move()
	{
		locX ++;
		locY++;
	}
	public boolean dead()
	{
		if(health >0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String stats()
	{
		return ("Health: " + health + ", X Coordinate: " + locX +", Y Coordinate: " + locY);
	}
	
}
