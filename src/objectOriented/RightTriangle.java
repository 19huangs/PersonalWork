package objectOriented;

public class RightTriangle {
	private double base;
	private double height;

	public RightTriangle() {
		base = -999.99;
		height = -999.99;

	}

	public RightTriangle(double newBase, double newHeight) {
		base = newBase;
		height = newHeight;
	}

	public double hypot() {
		double hypotenuse = Math.hypot(base, height);
		return hypotenuse;

	}

	public double perimeter() {
		return base + height + (Math.hypot(base, height));

	}

	public double area() {
		return (base * height) / 2;

	}
}
