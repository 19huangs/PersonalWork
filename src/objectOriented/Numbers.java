package objectOriented;

public class Numbers {
	public Numbers() {
	}

	public void sayNumber(double num) {
		System.out.println("Your number is: " + num);
	}

	public void sayNumberPlus2(double num) {
		num = num + 2;
		System.out.println("Your number plus 2 is: " + num);
	}

	public void saySum(double num, double num2) {
		num = num + num2;
		System.out.println("The sum is: " + num);

	}

	public double returnSquare(double square) {
		square = square * square;
		return square;
	}

	public double returnArea(double length, double width) {
		double area = length * width;
		return area;
	}
	
	public int returnRoundUp(double num) {
		int num2 =(int) Math.ceil(num);
		return num2;
	}
}