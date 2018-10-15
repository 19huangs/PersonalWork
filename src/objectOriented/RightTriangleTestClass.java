package objectOriented;

public class RightTriangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightTriangle daisy = new RightTriangle();
		System.out.println("Hypotenuse: " + daisy.hypot());
		System.out.println("Perimeter: " + daisy.perimeter());
		System.out.println("Area: " + daisy.area() + " \n");
		
		daisy = new RightTriangle(3.0, 4.0);
		System.out.println("Hypotenuse: " + daisy.hypot());
		System.out.println("Perimeter: " + daisy.perimeter());
		System.out.println("Area: " + daisy.area());
	}

}
