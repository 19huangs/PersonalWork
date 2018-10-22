package decisions;
import java.util.Scanner;
public class HowMuchDoYouWeigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("What is your weight on Earth?");
		double weight = input.nextDouble();
		
		System.out.println("1. Mercury");
		System.out.println("2. Venus");
		System.out.println("3. Mars");
		System.out.println("4. Jupiter");
		System.out.println("5. Saturn");
		System.out.println("Which planet are you on?");
		int choice = input.nextInt();
		
		switch (choice)
		{
		case 1:
			weight = weight * 0.37;
			break;
		case 2:
			weight = weight * 0.88;
			break;
		case 3: 
			weight = weight * 0.38;
			break;
		case 4: 
			weight = weight * 2.64;
			break;
		case 5: 
			weight = weight * 1.15;
			break;
		}
		
		System.out.println("New Weight: " + weight);
	}

}
