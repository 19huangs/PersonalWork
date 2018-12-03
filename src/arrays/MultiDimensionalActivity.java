package arrays;
import java.util. Scanner;
import java.util.Random;
public class MultiDimensionalActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random ();
		Random aafreen = new Random ();
		
		System.out.println("Number of rows: ");
		int rows = input.nextInt();
		
		System.out.println("Number of columns: ");
		int columns = input.nextInt();
		
		int [] [] cat = new int [rows][columns];
		
		int sum =0;
		int min = 0;
		int max = 100;
		for (int counter = 0; counter < cat.length; counter++)
		{
		
			for (int counter2 = 0; counter2 < cat[0].length; counter2++)
			{
				cat [counter][counter2] = min + bob.nextInt(max-min+1);
				System.out.print(cat [counter][counter2] + " ");
				sum += cat [counter] [counter2];
			}
			System.out.println();
			
		}	
		System.out.println("Sum of values in array: " + sum);
	}

}
