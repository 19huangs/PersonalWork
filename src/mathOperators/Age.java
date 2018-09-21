package mathOperators;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		int future = -999;
		Scanner input= new Scanner(System.in);
		System.out.println("How old are you?");
		age= input.nextInt();
		future = age + 7;
		System.out.println("In 7 years, you will be " + (future) + " years old.");
		
	}

}
