package mathOperators;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		Scanner input= new Scanner(System.in);
		System.out.println("How old are you?");
		age= input.nextInt();
		
		System.out.println("In 7 years, you will be " + (age +7) + " years old.");
		
	}

}
