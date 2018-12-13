package arrays;
import java.util.Scanner;
import java.util.Random;
public class MultiDimensionalAssessments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random ();
		
//Multi Dimensional Arrays of Objects
		/*System.out.println("Number of students at BC?");
		int numPeople = input.nextInt();
		input.nextLine();
		
		int rows = numPeople;
		int columns = 2;
		String [] [] cat = new String [rows][columns];
		
		String name = " " ;
			for (int counter2 = 0; counter2 < numPeople; counter2++)
			{
				System.out.print("Name: ");
				name = input.nextLine();
				cat[counter2][] = name.substring(0, name.indexOf(" "));
				cat[counter2][1] = name.substring(name.indexOf(" ")+1,name.length() );
	
			}
			double sum = 0;
			for (int counter = 0; counter < numPeople; counter++)
			{
			
				sum += cat[counter][0].length();
			}
			
			double average = sum / (double) numPeople;
			System.out.println("Average Length of First Name: " + average);
			
			for (int counter = 0; counter < numPeople; counter++)
			{
			
				System.out.println(cat[counter][1] + ", " + cat[counter][0]);
			}
	}*/
		
//Part 2		
		/*int rows = 2;
		int columns = 3;
		FriendClass [] [] cat = new FriendClass [rows][columns];
		
		String name = " " ;
		double sum =0;
			for (int counter = 0; counter < 2; counter++)
			{
				for (int counter2 = 0; counter2 < 3; counter2++)
				{
					System.out.print("Friend's Name: ");
					name = input.nextLine();
					
					System.out.print("Friend's Age: ");
					int age = input.nextInt();
					input.nextLine();
					
					cat [counter][counter2]= new FriendClass(name, age);
					sum += name.length();
				}
	
			}
			for (int counter = 0; counter < 2; counter++)
			{
				for (int counter2 = 0; counter2 < 3; counter2++)
				{
					System.out.print(cat [counter][counter2].getAge() + " ");
				}
				System.out.println();
			}
			
			System.out.println("Average Length of First Names: " + sum/(2*3));	
	}*/		
		int rows = 13;
		int columns = 18;
		int [] [] cat = new int [rows][columns];
		
		int min =1;
		int max = 7;
		int sum =0;
		int holeinOne =0;
		int best =126;
			for (int counter = 0; counter < rows; counter++)
			{
				for (int counter2 = 0; counter2 < columns; counter2++)
				{
					cat[counter][counter2] = min+bob.nextInt(max-min+1);
					
					if (cat[counter][counter2]==1)
					{
						holeinOne ++;
					}
				}
			}
			
			for (int counter = 0; counter < rows; counter++)
			{
				for (int counter2 = 0; counter2 < columns; counter2++)
				{
					sum += cat[counter][counter2];
					if (sum<best)
					{
						best=sum;
					}
			}
		}
	}
}
