package inheritance;

public class Square extends Rectangle{
	public Square(){
		super();
	}
	public Square(double length)
	{
		super(length, length);
	}
	public double area()
	{
		return super.getS1()*super.getS2();
	}
}