package objectOriented;

public class TrapezoidTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezoid daisy = new Trapezoid();
		System.out.println("Perimeter: " + daisy.perimeter());
		System.out.println("Area: " + daisy.area() + " \n");

		daisy = new Trapezoid(3.0, 4.0, 5.0, 6.0);
		System.out.println("Perimeter: " + daisy.perimeter());
		System.out.println("Area: " + daisy.area() + " \n");
	}

}
