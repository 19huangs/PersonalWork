package mathOperators;
import java.util.Scanner;
public class postIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 999.99;
		double width = 999.99;
		final double POSTIT = 9.0;
		double numpost = 999.99;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		length = input.nextDouble();
		System.out.println("What is the width?");
		width = input.nextDouble();
		
		numpost = (length * width)/ POSTIT;
		
		System.out.println("You will need " + numpost + " post-its to cover");
	}

}
