package inheritance;

public class Rectangle extends Parallelogram implements Geo{

	public Rectangle()
	{
		super();
	}
	
	public Rectangle (double length, double width)
	{
		super(length,width, length);
	}
	
	public double area()
	{
		return super.getS1()*super.getS2();
	}
	public boolean equals(Object otherObject)
	{
		if(this.toString().equals(otherObject.toString()))
			{
			return true;
			}
		else
		{
			return false;
		}
	}
}
