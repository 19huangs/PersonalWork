package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{

	public Trapezoid()
	{
		super();
	}
	public Trapezoid(double top, double bottom, double slant)
	{
		super(slant, top, slant, bottom);
	}
	
	public double area()
	{
		double cat = (super.getS2()+super.getS4());
		double dog = (super.getS4()-super.getS2())/2  ;
		double triangle = Math.sqrt( (super.getS3()*super.getS3()) -(dog*dog));
		return (triangle * cat)/2;
	}
}
