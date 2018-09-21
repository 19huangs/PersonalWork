package inputExamples;
import java.util.Scanner;
public class AgeandWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		
		double weight = -999.99;
		System.out.println("What is your weight?");
		weight = input.nextDouble();
		System.out.println("You are " + age + " years old and " + weight + " pounds.");
	}

}
