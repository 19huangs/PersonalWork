package arrays;
import java.util.Scanner;
import java.util.Random;
public class MultiProgrammingOpps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random ();

//Roll a Die 1,2,3
		/*System.out.println("How many students?");
		int students = input.nextInt();
		
		System.out.println("How many sides?");
		int sidesDie = input.nextInt();
		
		System.out.println("Number of times each student should roll?");
		int numRolls = input.nextInt();
		
		
		int min=1;
		int max = sidesDie;
		int [][] cat = new int [students][numRolls];
		
		for (int counter =0; counter <students; counter ++)
		{
			for (int counter2 = 0; counter2 < numRolls; counter2 ++)
			{
				cat [counter][counter2] = min + bob.nextInt(max-min+1);
				System.out.print(cat [counter][counter2] + " ");
			}
			System.out.println();
		}
	}*/

//Wedding Planner
		
		System.out.println("Number of people attending the wedding?");
		int numPeople = input.nextInt();
		input.nextLine();
		
		int rows = numPeople/8;
		int columns = 8;
		FriendClass [] [] cat = new FriendClass [rows][columns];
		
		String name = " " ;
		for (int counter = 0; counter < rows; counter++)
		{
		
			for (int counter2 = 0; counter2 < columns; counter2++)
			{
				System.out.print("Full name: ");
				name = input.nextLine();
			
				System.out.print("Age: ");
				int age = input.nextInt();
				input.nextLine();
				cat [counter] [counter2] = new FriendClass(name,age);
			}
		
		}
		System.out.println ("Seating Chart-Full Name");
		for (int counter3 = 0; counter3 < cat.length; counter3++)
		{
			for (int counter4 = 0; counter4 < cat[0].length; counter4++)
			{
				System.out.print("(" + cat [counter3][counter4].getName() + ") ");
			}
			System.out.println();
		}
		
		
		System.out.println ("Seating Chart-Last Name");
		for (int counter3 = 0; counter3 < cat.length; counter3++)
		{
			for (int counter4 = 0; counter4 < cat[0].length; counter4++)
			{
				System.out.print(cat [counter3][counter4].getName().substring(cat [counter3][counter4].getName().indexOf(" ")+1));
			}
			System.out.println();
		}
	}
}
	
