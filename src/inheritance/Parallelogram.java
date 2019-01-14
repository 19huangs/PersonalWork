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
	}
	
	public double area()
	{
		return super.getS1()*height;
	}
}
