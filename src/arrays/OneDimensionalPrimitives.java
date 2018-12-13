package arrays;
import java.util.Random;
import java.util.Scanner;
public class OneDimensionalPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Practice Assessment 1
		
		Random bob = new Random (1);
		Scanner input = new Scanner(System.in);
		
		/*int numIntegers = 100;
		int [] cat = new int [numIntegers];
		
		int randomNum = 0;
		int max =852;
		int min =7;
		for (int counter = 0; counter < cat.length; counter++)
		{
			randomNum = min + bob.nextInt(max-min+1);
			cat[counter] = randomNum;
		}
		 
		double sum =0;
		double number =0;
		System.out.println("Pick a random integer to display: ");
		int pick = input.nextInt();
		do
		{
			sum +=(cat[pick-1]);
			number++;
			System.out.println(cat[pick-1]);
			System.out.println("Pick a random integer to display (Put in 999 to quit): ");
			pick = input.nextInt();
			
		}
		while (pick!=999);
		
		double average = sum/number;
		System.out.println("Average: " + average);
	}*/
	
		
//Practice Assessment objects
	
		/*int numIntegers = 500;
		FriendClass [] cat = new FriendClass [numIntegers];
		
		String friend = "";
		int age = 0;
		for (int counter = 0; counter < cat.length; counter++)
		{
			System.out.println("Name of Friend: ");
			friend = input.nextLine();
			
			
			System.out.println("Age of Friend: ");
			age = input.nextInt();
			input.nextLine();
			
			cat [counter] = new FriendClass(friend, age);
		}
		
		for (int counter2 = cat.length-1; counter2 >= 0; counter2--)
		{
			System.out.println("Name: " + cat[counter2].getName());
			System.out.println("Age: " + cat[counter2].getAge());
		}
	}*/
		
		int numIntegers = 10;
		String [] cat = new String [numIntegers];
		
		String lastName = " ";
		int num =0;
		double sum = 0;
		double count = 0;
		for (int counter = 0; counter < cat.length; counter++)
		{
			System.out.println("Full name of Teacher: ");
			cat [counter] = input.nextLine();
		
			lastName = cat[counter].substring(cat[counter].indexOf(" ") + 1, cat[counter].length());
			num = lastName.length();
			
			sum +=num;
			count++;
		}
		
		double average = sum/count;
		System.out.println("Average length of last names: " + average);
	}
}
		
		

