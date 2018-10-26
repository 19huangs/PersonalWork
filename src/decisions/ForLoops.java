package decisions;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int counter =0;
		for (counter = 1; counter <=5; counter = counter +1);
		{
			System.out.println(counter);
		}
	}*/
		
		/* int counter = 0;
		for (counter = 1; counter <=10; counter++)
		{
			System.out.println(counter + " Hello");
		}
}*/
		
		/*int counter = 0;
		for (counter = 15; counter <=60; counter+= 5)
		{
			System.out.println(counter + " Hello");
		}
		
	}*/
		/*int counter = 0;
		for (counter = 10; counter >=1; counter-= 1)
		{
			System.out.println(counter + " Hello");
		}
		
	}*/
		/*Scanner input = new Scanner (System.in);
		int counter = 0;
		int number = 0;
		System.out.println("How many Hello's would you like?");
		number = input.nextInt();
		if (number <0)
		{
			number = 0;
			System.out.println("Your number does not work.");
		}
		
		for (counter = 1; counter <=number; counter+= 1)
		{
			System.out.println(counter + " Hello");
		}
		
	}*/
		/*Scanner input = new Scanner (System.in);
		int counter = 0;
		int number = 0;
		System.out.println("What is your favorite number?");
		number = input.nextInt();
		
		for (counter = 1; counter <=10; counter++)
		{
			System.out.println(number + " Hello");
		}
		
	}*/
		/* Scanner input = new Scanner (System.in);
		int counter = 0;
		int sum = 0;
		for (counter = 1; counter <=10; counter++)
		{
			sum = counter+ sum;
		}
		System.out.println("Sum: " + sum);
	}	*/
		
		 Scanner input = new Scanner (System.in);
			int counter = 0;
			int sum = 0;
			int number = 0;
			for (counter = 1; counter <=5; counter++)
			{
				System.out.println("Enter a number: ");
				number = input.nextInt();
				sum = sum+ number;
			}
			System.out.println("Sum: " + sum);
		}
}
