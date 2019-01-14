package inheritance;

public class Parallelogram extends Quadrilateral{
	private double height;
	public Parallelogram()
	{
		super();
		height = 10;
	}
	
	public Parallelogram (double base, double slant, double xHeight)
	{
		super(base,slant,base, slant);
		height = xHeight;
	}
	
	public double area()
	{
		return super.getS1()*height;
	}
	public String toString()
	{
		return super.toString() +", Height: " + height;
	}
	public boolean equals(Object anObject)
	{
		return this.toString().equals(anObject.toString());
	}
}
