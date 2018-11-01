package decisions;
import java.util.Scanner;
import java.util.Random;
public class SampleAssessments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random input2 = new Random();
//WHILE	
		/*int number = 0;
		int guess = 0;
		int numAttempts = 1;
		
		guess = input2.nextInt(1000);
		 // only use (System.out.println(guess);) if you want to see the random number
		
		System.out.println("Pick a number: ");
		number = input.nextInt();
		
		
		while (number!=guess)
		{
			numAttempts++;
			if (number > guess)
			{
				System.out.println("Number is too big. Pick a new number: ");
				number = input.nextInt();
			}
			if (number < guess)
			{
				System.out.println("Number is too small. Pick a new number: ");
				number = input.nextInt();
			}
			
		}
		System.out.println("Number of attempts: " + numAttempts);
	}*/
//DO WHILE ASSESSMENT	
		/* int cup =0;
		double numAttempts = 0;
		int guess = 0;
		int next=0;
		double wins =0;
		double percentage =0;
		
		do
		{
			guess = input2.nextInt(2);
			System.out.println("Pick cup number: ");
			cup=input.nextInt();
			numAttempts++;
			
			if (guess==0)
			{
				guess=3;
			}
			if (cup==guess)
			{
				wins++;
				System.out.println("You win");
			
			}
			else 
			{
				System.out.println("You lose");
				
			}
			System.out.println("Keep Playing? yes=1, no = 0");
			next = input.nextInt();
			
		}	
		while (next!= 0);
		percentage = (wins/numAttempts) * 100;
		System.out.println("You winning percentage is: " + percentage + "%");
	}*/

//FOR LOOP
		int number = 0;
		int counter = 0;
		int sum = 0;
		System.out.println("Pick a number: ");
		number=input.nextInt();
		if (number%2 !=0)
		{
			number = number+1;
		}
		for (counter=number; counter<=1000; counter+=2)
		{
			sum = sum + counter;
		}
		System.out.println("Sum of even numbers: " + sum);
	}
}
		
