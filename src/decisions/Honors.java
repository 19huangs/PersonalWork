package decisions;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("Are you a senior?");
		boolean senior = input.nextBoolean();
		
		if (GPA>=3.5 && senior==true)
		{
			System.out.println("You will graduate with honors!");
		}
		else
		{
			System.out.println("You will not graduate with honors!");
		}*/
		
		/* System.out.println("What is your age?");
		double age = input.nextDouble();
		if (age>=18)
		{
			System.out.println("What is your height?");
			double height = input.nextDouble();
			
			System.out.println("Lucky Number: " + (int)(height*5));
		}
		else
		{
			System.out.println("What is your weight?");
			double weight = input.nextDouble();
			
			System.out.println("Lucky Number: " + (int)(weight/2));
		} */
		
		System.out.println("How much money did you recieve on your fifth birthday?");
		double money = input.nextDouble();
		double number2 = Math.sqrt(84.3);
		if (Math.abs(money-number2) <= 0.01)
		{ 
			System.out.println("You won a good prize!");
		}
		else
		{
			System.out.println("You won a bad prize!");
		}
	}

}
