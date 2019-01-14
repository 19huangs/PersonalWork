package inheritance;

public class Car extends Auto{
	private int cupHolders;
	public Car(int xcupHolders)
	{
		cupHolders=xcupHolders; 
	}
	public int getCupHolders()
	{
		return cupHolders;
	}
}
