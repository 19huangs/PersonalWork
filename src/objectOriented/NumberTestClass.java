package objectOriented;

public class NumberTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers bob = new Numbers();
		bob.sayNumber(7.5);
		bob.sayNumberPlus2(9.8);
		bob.saySum(5.0, 10.1);
		
		double square = bob.returnSquare(5.0);
		System.out.println("Your number is: " + square);
		
		double area = bob.returnArea(5.0,10.0);
		System.out.println("Your area is: " + area);
		
		int num2 = bob.returnRoundUp(5.3);
		System.out.println("Your number rounded up is: " + num2);
	}

}
