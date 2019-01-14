package inheritance;

public class Auto {
	private double odometer;
	private double mPG;
	
	public Auto()
	{
		odometer =0;
		mPG = 30;
	}
	public Auto(double xOdometer,double xMPG)
	{
		odometer = xOdometer;
		mPG = xMPG;
	}
	public double getOdometer()
	{
		return odometer;
	}
	public double getMPG()
	{
		return mPG;
	}
	public void drive(double miles)
	{
		if(miles<=0)
		{
			miles = 0;
		}
		odometer +=miles;
	}
	public String toString()
	{
		return "Automobile= " + "Odometer: " + odometer + "mPG: " + mPG;
	}
}
