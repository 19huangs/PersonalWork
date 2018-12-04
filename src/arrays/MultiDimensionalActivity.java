package arrays;
import java.util. Scanner;
import java.util.Random;
public class MultiDimensionalActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random (1);
		
		/*System.out.println("Number of rows: ");
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
	}*/
		/*int rows = 3;
		int columns = 7;
		int third = 8;
		
		int min = 0;
		int max = 50;
		int sum = 0;
		int [] [][] cat = new int [rows][columns][third];
		
		for (int counter = 0; counter < cat.length; counter++)
		{
		
			for (int counter2 = 0; counter2 < cat[0].length; counter2++)
			{
				for (int counter3 = 0; counter3 < cat[0][0].length; counter3++)
				{
					cat [counter][counter2][counter3] = min + bob.nextInt(max-min+1);
					sum += cat [counter] [counter2] [counter3];
				}
			}
		}
		System.out.println("Sum of values: " + sum);
	}*/
		/*int rows = 2;
		int columns =3;
		
		String [] [] cat = new String [rows][columns];
		
		for (int counter = 0; counter < cat.length; counter++)
		{
		
			for (int counter2 = 0; counter2 < cat[0].length; counter2++)
			{
					
				System.out.print("Full name: ");
				cat [counter] [counter2] = input.nextLine();	
			}
		
		}
		
		for (int counter3 = 0; counter3 < cat.length; counter3++)
		{
			for (int counter4 = 0; counter4 < cat[0].length; counter4++)
			{
				System.out.print(cat [counter3][counter4].length() + " ");
			}
			System.out.println();
		}
	}*/
		
		
		int rows = 2;
		int columns =3;
		
		FriendClass [] [] cat = new FriendClass [rows][columns];
		
		int min = 0;
		int max = 100;
		int sum = 0;
		for (int counter = 0; counter < cat.length; counter++)
		{
		
			for (int counter2 = 0; counter2 < cat[0].length; counter2++)
			{
				System.out.print("Full name: ");
				String name = input.nextLine();
				cat [counter] [counter2] = new FriendClass(name,(min + bob.nextInt(max-min+1)));
			}
		
		}
		
		for (int counter3 = 0; counter3 < cat.length; counter3++)
		{
			for (int counter4 = 0; counter4 < cat[0].length; counter4++)
			{
				System.out.print(cat [counter3][counter4].getAge() + " ");
			}
			System.out.println();
		}
	}
}
