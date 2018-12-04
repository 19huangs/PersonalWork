package arrays;
import java.util.Scanner;
public class MultiDimensionalAssessments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Number of students at BC?");
		int numPeople = input.nextInt();
		input.nextLine();
		
		int rows = numPeople;
		int columns = 2;
		String [] [] cat = new String [rows][columns];
		
		String name = " " ;
		for (int counter = 0; counter < rows; counter++)
		{
		
			for (int counter2 = 0; counter2 < numPeople; counter2++)
			{
				System.out.print("First name: ");
				name = input.nextLine();
				
				
				System.out.print("Last Name: ");
				String lastName = input.nextLine();
				input.nextLine();
				
			}
		
		}
		double sum = 0;
		for (int counter3 = 0; counter3 < cat.length; counter3++)
		{
			for (int counter4 = 0; counter4 < cat[0].length; counter4++)
			{
				sum += cat [counter3] [1].length();
			}
		}
		
		System.out.println("Average length of first name: " + sum/(double) numPeople);
		for (int counter3 = 0; counter3 < cat.length; counter3++)
		{
			for (int counter4 = 0; counter4 < cat[0].length; counter4++)
			{
				System.out.println(cat [counter4] [2]+ ", "+ cat [counter3] [1]);
			}
		}
		System.out.println("");
	
	}

}
