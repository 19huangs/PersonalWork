package objectOriented;

public class Circle {
	private double radius;

	public Circle() {
		radius = -999.99;

	}
	public Circle(double newRadius) {
		radius = newRadius;
	}

	public double returnRadius() {
		return radius;
	}

	public double Circumfrence() {
		double circum = 2 * radius * Math.PI;
		return circum;
	}

	public double Area() {
		double  areaofcircle = radius * radius * Math.PI;
		return areaofcircle;
	}

	public void changeRadius(double xRadius) {
		radius = xRadius;
	}
}