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
		int radius1 =0;
		int radius2 =0;
		int radius3 = 0;
		
		
		do 
		{ 
			System.out.println("What is Radius 1? (Enter 999 to quit)");
			radius1 = input.nextInt();
			Circle aafreen = new Circle(radius1);
			aafreen.Circumfrence();
		
			System.out.println("What is Radius 2?");
			radius2 = input.nextInt();
			Circle aaafreen = new Circle(radius2);
		
			System.out.println("What is Radius 3?");
			radius3 = input.nextInt();
			Circle aaaafreen = new Circle(radius3);
			
			System.out.println("Perimeters: " + aafreen.Circumfrence() + "," +aaafreen.Circumfrence() + "," + aaaafreen.Circumfrence());
		}
		while (radius1!=999);
}
}


		
