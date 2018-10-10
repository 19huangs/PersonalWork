package objectOriented;

public class Circle {
	private double radius;

	public Circle() {
		radius = -999.99;

	}
		

	public double returnRadius() {
		return radius;
	}

	public double Circumfrence() {
		return 2 * radius * Math.PI;
	}

	public double Area() {
		return  radius * radius * Math.PI;
	}

	public void changeRadius(double xRadius) {
		radius = xRadius;
	}
}