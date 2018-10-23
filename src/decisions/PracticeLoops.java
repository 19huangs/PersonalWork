package decisions;

import java.util.Scanner;

public class PracticeLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int answer = 0; //get
		 * 
		 * while (answer<=100) //test { //use System.out.println(answer); answer
		 * +=1; //get
		 */

		/*int aafreen = 0;

		while (aafreen <= 100000) 
		{
			System.out.println(aafreen);
			aafreen += 2;
		}*/
		Scanner input = new Scanner (System.in);
		
		/*int number = 0;
		int sum = 0 ;
		System.out.println("Please enter a number. (9999 to quit): ");
		number = input.nextInt();
		while (9999 != number)
		{
			
			System.out.println("Please enter a number. (9999 to quit): ");
			number = input.nextInt();
			sum = sum + number;
			System.out.println(sum); 
			
		}
		
		}*/
		/* int number = 0;
		int sum = 0 ;
		int average = 00;
		int inputs = 0;

		while (number != 9999)
		{
			
			inputs ++;
			sum = sum + number;
		
			average =sum/inputs;
			System.out.println("Please enter a number. (9999 to quit): ");
			number = input.nextInt();
		
			
		}
		System.out.println("Average: " + average); 
		} */
		int number = 0;
		int largest = 0;
		while (number != 9999)
		{

			System.out.println("Please enter a number. (9999 to quit): ");
			number = input.nextInt();
			if (number>largest)
			{
				largest=number;
			}
			
		}
		System.out.println("Biggest Number: " + largest);
		}
	}
