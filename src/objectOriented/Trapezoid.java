package objectOriented;

public class Trapezoid {
	private double base1;
	private double base2;
	private double height;
	private double leg;

	public Trapezoid() {
		base1 = -999.99;
		base2 = -999.99;
		height = -999.99;
		leg = -999.99;
	}

	public Trapezoid(double newBase1, double newBase2, double newHeight, double newLeg) {
		base1 = newBase1;
		base2 = newBase2;
		height = newHeight;
		leg = newLeg;
	}

	public double perimeter() {
		double perimeter = base1 + base2 + (leg * 2);
		return perimeter;

	}

	public double area() {
		double area = ((base1 + base2) * height) / 2;
		return area;
	}
}
