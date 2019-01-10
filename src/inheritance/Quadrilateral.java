package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	
	public Quadrilateral ()
	{
		s1 = 1;
		s2 = 1;
		s3 = 1;
		s4 = 1;
	}
	public Quadrilateral (double xS1, double xS2, double xS3, double xS4)
	{
		s1 = xS1;
		s2 = xS2;
		s3 = xS3;
		s4 = xS4;
	}
	
	public double getS1()
	{
		return s1;
	}
	public double getS2()
	{
		return s2;
	}
	public double getS3()
	{
		return s3;
	}
	public double getS4()
	{
		return s4;
	}
	public void setS1(double xS1)
	{
		s1 = xS1;
	}
	public void setS2(double xS2)
	{
		s2 = xS2;
	}
	public void setS3(double xS3)
	{
		s3 = xS3;
	}
	public void setS4(double xS4)
	{
		s4 = xS4;
	}
	public double getPerimeter()
	{
		return s1+s2+s3+s4;
	}
	
}
