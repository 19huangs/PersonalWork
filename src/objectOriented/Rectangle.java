package objectOriented;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = -999.99;
		width = -999.99;
	}

	public double returnLength() {
		return length;
	}

	public double returnWidth() {
		return width;
	}

	public double Perimeter(double perimeter) {
		return perimeter;

	}

	public double Area(double area) {
		return area;
	}

	public void changeLength(double xLength) {
		length = xLength;
	}

	public void changeWidth(double xWidth) {
		width = xWidth;
	}
}
