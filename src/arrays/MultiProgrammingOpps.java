package arrays;
import java.util.Scanner;
import java.util.Random;
public class MultiProgrammingOpps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random bob = new Random ();

//Roll a Die 1,2,3
		System.out.println("How many students?");
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
	}

		
}
