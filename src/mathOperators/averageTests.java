package mathOperators;
import java.util.Scanner;
public class averageTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test1 = 999.99;
		double test2 = 999.99;	
		double test3 = 999.99;
		double average = 999.99;
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("What is the score of test 1?");
		test1 = input.nextDouble();
		
		System.out.println("What is the score of test 2?");
		test2 = input.nextDouble();
		
		System.out.println("What is the score of test 3?");
		test3 = input.nextDouble();
		average = (test1 + test2 + test3) / 3;
		
		System.out.println("The average test score is: " + average);
	}

}
