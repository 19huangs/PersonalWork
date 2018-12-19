package designingClasses;

public class Phone {
	private static int companyProductNumber =1000;
	private int productNumber;
	private int myNumber;
	private static int maxMinutes= 10000;
	private int minutesUsed;
	
	public Phone(int xMyNumber, int xMinutesUsed)
	{
		myNumber = xMyNumber;
		minutesUsed = xMinutesUsed;
		companyProductNumber++;
	}
	
	public void makeCall (int talk)
	{
		minutesUsed = minutesUsed+talk;
		if (minutesUsed >maxMinutes)
		{
			minutesUsed = 10000;
		}
	}
	
	public int timeRemaining()
	{
		return maxMinutes-minutesUsed;
	}
	
	public void reset()
	{
		minutesUsed = 0;
	}
	
	public Phone clone()
	{
		return new Phone (myNumber, minutesUsed);
	}
	
	public String toString()
	{
		return ("Number: " + myNumber + " Minutes Used: " + minutesUsed);
	}
}
