package decisions;
import java.util.Scanner;
public class HomeworkLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Count by 5
		Scanner input = new Scanner (System.in);
		/*int number = 0;
		System.out.println("What value do you want to go up to?");
		int value = input.nextInt();
		
		while (number<=value)
		{
			System.out.print((number) + " ");
			number = number + 5;
		
		}
	} */
//Large/Small
		/* double test = 0;
		double largest = 0;
		double smallest = 9999;
		System.out.println("What is your test score?");
		test =input.nextDouble();
		while (test!=9999)
		{
			if (test>largest)
			{
				largest = test;
			}
			if (test< smallest)
			{
				smallest = test;
			}
			System.out.println("What is your test score? (Enter 9999 to quit)");
			test =input.nextDouble();
		}
		System.out.println("Largest Test Score: " + largest + "\n" + "Smallest Test Score: " + smallest);

	}*/
//Test Scores	
		/* double test = 0;
		double sum =0;
		double numtest=0;
		double average = 0;
		System.out.println("What is your test score?");
		test =input.nextDouble();
		while (test!=9999)
		{
			sum += test;
			numtest++;
			average = sum/numtest;
			System.out.println("What is your test score? (Enter 9999 to quit)");
			test =input.nextDouble();
		}
		System.out.println("Sum: " + sum + "\n" + "Average: " + average);
	}*/
//Rounding Fun
		/*double number=0;
		double divisor = 0;
		System.out.println("Four digit number: ");
		number =input.nextDouble();
		while (number!=9999)
		{
			divisor = number%100;
			number = ((int) number / 100);
			if (divisor >=50)
			{
				number++;
			}
			number = number*100;
			System.out.println("Rounded Number: " + number);
			System.out.println("Four digit number: ");
			number =input.nextDouble();
			}
		}*/
//DO WHILE LOOPS
//Sum the Numbers
		/*double number1 = 0;
		double number2 = 0;
		double sum = 0;
		System.out.println("Number 1 (Enter 999 to quit): ");
		number1 =input.nextDouble();
		do
		{
			System.out.println("Number 2 (Enter 999 to quit): ");
			number2 =input.nextDouble();
			sum = number1 + number2;
			System.out.println("Sum: " + sum);
			System.out.println("Number 1 (Enter 999 to quit): ");
			number1 =input.nextDouble();
		
		}
		while (number1 !=999);
	}*/
//How Many Numbers?
		/*double number = 0;
		double sum = 0;
		int numenters = 0;
	
		do
		{
			System.out.println("Number: ");
			number =input.nextDouble();
			sum = sum + number;
			numenters ++;
		}
		while (sum <=2018);
		System.out.println("Numbers entered: " + numenters);
	}*/
//Circle Test
		/* int radius1 =0;
		int radius2 =0;
		int radius3 = 0;
		
		System.out.println("What is Radius 1? (Enter 999 to quit)");
		radius1 = input.nextInt();
		
		do 
		{ 
			
			Circle aafreen = new Circle(radius1);
			aafreen.Circumfrence();
		
			System.out.println("What is Radius 2?");
			radius2 = input.nextInt();
			Circle aaafreen = new Circle(radius2);
		
			System.out.println("What is Radius 3?");
			radius3 = input.nextInt();
			Circle aaaafreen = new Circle(radius3);
			
			
			
			System.out.println("Perimeters: " + aafreen.Circumfrence() + " ," +aaafreen.Circumfrence() + " ," + aaaafreen.Circumfrence());
			
			System.out.println("What is Radius 1? (Enter 999 to quit)");
			radius1 = input.nextInt();
		}
		while (radius1!=999);
		
}*/

//FOR LOOPS
//Sum of Odd
		/*int counter =0;
		int sum = 0;
		int number = 0;
		System.out.println("Number: ");
		number = input.nextInt();
		if (number<0)
		{
			System.out.println("Pick a new number: ");
			number=input.nextInt();
		}
		for (counter = 1; counter <= number; counter += 2)
		{
			
			sum = sum + counter;
		}
		System.out.println("Sum: " + sum);
		}*/
		
		/*int counter = 0;
		int numstudents=0;
		double average = 0;
		double sum = 0;
		double test = 0;
		System.out.println("Number of students: ");
		numstudents=input.nextInt();
		
		
		for (counter = 1; counter<=numstudents; counter++)
		{
			System.out.println("Test Score: ");
			test=input.nextInt();
			
			sum = sum + test;
		}
		average = sum/numstudents;
		System.out.println("Average: " + average);
	}*/
		
//Factorial
		/*int counter = 0;
		int number=0;
		int factorial = 1;
		System.out.println("Number: ");
		number=input.nextInt();
		
		System.out.print(number + "! =");
		for (counter =number; counter>0; counter-=1)
		{
			
			factorial = factorial*counter;
			System.out.print( counter + "*" );
		
		}
		System.out.print(" =" + factorial);
	}*/

		
//Cash Register
		
		/* int numItems = 0;
		double price = 0;
		double cost = 0;
		int counter =0;
		double tax = 0;
		System.out.println("How many items?");
		numItems=input.nextInt();
		
		for (counter = 1; counter<= numItems; counter++)
		{
			System.out.println("What is the price of the item?");
			price = input.nextDouble();
			
			cost = cost + price;
		}
		tax = cost *0.05;
		System.out.println("Total cost: " + cost);
		System.out.println("Tax: " + tax);
		System.out.println("Total: " + (tax + cost));
	}*/
//Divisors		
		/*int counter = 0;
		int number = 0;
		int numdivisors = 0;
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		for (counter = 1; counter<=number; counter++)
		{
			if (number%counter == 0)
			{
				numdivisors++;
			}
		}
		
		System.out.println("Number of divisors: " + numdivisors);
	}*/
// Largest Divisor		
		/*int counter = 0;
		int number = 0;
		int largest = 0;
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		for (counter = 1; counter<number; counter++)
		{
			if (number%counter == 0)
			{
					largest = counter;
	
			}
		}
		System.out.println("Largest Divisor (other than itself): " + largest);
	}*/
		
// Prime Number	
		/*int counter = 0;
		int number = 0;
		int numdivisors = 0;
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		for (counter = 1; counter<=number; counter++)
		{
			if (number%counter == 0)
			{
				numdivisors++;
			}
		}
		if (numdivisors == 2)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}*/
		
		
//NESTED LOOPS
//Divisors Input
		
		/*int counter = 0;
		int counter2 = 0;
		int number = 0;
		int numdivisors = 0;
		int largest = 0;
		int theEndInteger = 0;
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		for (counter = 1; counter<=number; counter++)
		{
			for (counter2 = 1; counter2<=number; counter2++)
			{
				if (counter%counter2 ==0)
				{
					numdivisors++;
				}
				if (numdivisors> largest)
				{
					largest = numdivisors;
					theEndInteger = counter;
				}
			}
			numdivisors = 0;
		
		}
		System.out.println("Integer with the most divisors: " + theEndInteger);
	}*/
		
		int counter = 0;
		int counter2 = 0;
		int counter3=0;
		
			for (counter=5; counter >=1; counter-= 1)
			{
				for (counter2 = 1; counter2<=5; counter2 ++)
				{
					System.out.print(counter+ " ");
				}
				System.out.println();
			}
		
	}
}
	
	


		
		



		
