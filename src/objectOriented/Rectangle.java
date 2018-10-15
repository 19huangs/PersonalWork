package objectOriented;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = -999.99;
		width = -999.99;
	}
	public Rectangle(double newL, double newW){
		length = newL;
		width = newW;
	}

	public double returnLength() {
		return length;
	}

	public double returnWidth() {
		return width;
	}

	public double Perimeter() {
		return (2*length) +(2*width);

	}

	public double Area() {
		return length*width;
	}

	public void changeLength(double xLength) {
		length = xLength;
	}

	public void changeWidth(double xWidth) {
		width = xWidth;
	}
}
