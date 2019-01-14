package inheritance;

public class TrapezoidTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezoid bob = new Trapezoid(5,6,10);
		System.out.println(bob.getPerimeter());
		System.out.println(bob.area());
		
		Parallelogram bobb = new Parallelogram(5,6,7);
		System.out.println(bobb.toString() );
	}

}
