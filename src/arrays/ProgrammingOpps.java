package arrays;
import java.util.Scanner;
import java.util.Random;
public class ProgrammingOpps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MORE SSN
		Scanner input = new Scanner (System.in);
		
		/*int numEmployees =10;
		String [] cat = new String [numEmployees];
		String firstsub = " ";
		String lastfour = " ";
		
		
		for (int counter = 0; counter < cat.length; counter++)
		{
			System.out.println("Write SSN ***-**-****: ");
			String social = input.nextLine();
			
			firstsub = social.substring(social.indexOf("-")+1, social.length());
			lastfour = firstsub.substring(firstsub.indexOf("-")+1, firstsub.length());
			
			cat[counter] = lastfour;
		}
		for (int counter2 = 0; counter2 < cat.length; counter2++)
		{
			System.out.println(cat[counter2]);
		}	
	}*/
		Random bob = new Random ();
		int numbers =10000;
		int [] cat = new int [numbers];
		
		int times =0;
		int max = 100;
		int min =0;
		
		for (int counter = 0; counter < cat.length; counter++)
		{
			cat[counter] = min + bob.nextInt(max-min+1);
		}	
			
		System.out.println("Number (1-100): ");
		int num = input.nextInt();
		do
		{
			for (int counter2 = 0; counter2 < cat.length; counter2++)
			{
				if (num == cat[counter2])
				{
				times ++;
				}
			}	
			System.out.println("Number of times chosen number is in the array " + times);
			
			times = 0;
			System.out.println("Number (1-100, 999 to quit): ");
			num = input.nextInt();
			
			
			
		}
		while (num !=999);
	}	
}
