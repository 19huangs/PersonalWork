package inputExamples;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first one digit integer?");
		first = input.nextInt();
		
		int second = 0;
		System.out.println("What is your second one digit integer?");
		second = input.nextInt();
		
		int third = 0;
		System.out.println("What is your third one digit integer?");
		third = input.nextInt();
		
		System.out.println("Here are your possible passwords:");
		
		System.out.println(first + "" + second + "" + third);
		System.out.println(first + "" + third + "" +  second);
		System.out.println(second + "" +first +  "" +  third);	
		System.out.println(second + "" +third + "" +  first);	
		System.out.println(third + "" +first +  "" + second);	
		System.out.println(third + "" +second +  "" + first);	
	}

}
