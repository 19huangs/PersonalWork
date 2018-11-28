package arrays;
import java.util.Scanner;
import java.util.Random;
public class ClassActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random ();
//Store 5 values	
		/*int [] testscores = new int [5];
		
		for (int counter = 0; counter <=4; counter++)
		{
			System.out.println("Give A Score: ");
			testscores [counter] = input.nextInt();
		}
		System.out.println(testscores[1]);*/

//Sum of array values	
		/*int [] testscores = new int [5];
		
		for (int counter = 0; counter <=4; counter++)
		{
			System.out.println("Give A Score: ");
			testscores [counter] = input.nextInt();
		}
		int sum = 0; 
		for (int counter = 0; counter <=4; counter++)
		{
			sum +=testscores [counter];
		}
		System.out.println("Sum: " + sum);
	}*/
		
		
//backward 		
		
		/*int [] testscores = new int [5];
		
		for (int counter = 1; counter <=5; counter++)
		{
			System.out.println("Give A Score: ");
			testscores [counter] = input.nextInt();
		}
		
		for (int counter = 4; counter >=0; counter--)
		{
			System.out.println(testscores[counter]);
		}
	}*/

//random number
		/*int largest = 0;
		int min = 0; 
		int max = 1000; 
		int randomNum = 0;
		int [] testscores = new int [250];
		
		for (int counter1 =1; counter1 <=250; counter1++) 
		{ 
			randomNum = min + bob.nextInt(max-min+1);
			
			if (randomNum > largest)
			{
				largest = randomNum;
			}
		}
		
		System.out.println(largest);
	}*/
		
	//Problem with testscores.length	
		
		/*final int numScores= 5;
		int [] testscores = new int [numScores];
		
		for (int counter = 0; counter < testscores.length; counter++)
		{
			System.out.println("Give A Score: ");
			testscores [counter] = input.nextInt();
		}
		int sum = 0; 
		for (int counter = 0; counter < testscores.length; counter++)
		{
			sum +=testscores [counter];
		}
		System.out.println("Sum: " + sum);
	}*/
		
//20 Names backward
		/*final int numNames= 20;
		String [] names = new String [numNames];
		
		for (int counter = 0; counter < names.length; counter++)
		{
			System.out.println("Give A Name: ");
			names [counter] = input.nextLine();
		}
		
		for (int counter2 = (names.length-1); counter2 >=0; counter2--)
		{
			System.out.println(names[counter2]);
		}
	}	*/
	//last letter
		/* final int numNames= 20;
		String [] names = new String [numNames];
		
		for (int counter = 0; counter < names.length; counter++)
		{
			System.out.println("Give A Name: ");
			names [counter] = input.nextLine();
		}
		
		System.out.println("Give a letter: ");
		String letter = input.nextLine();
		
		for (int counter = 0; counter < names.length; counter++)
		{
			char endletter = names[counter].charAt(names[counter].length()-1);
			if (endletter == letter.charAt(0))
			{
				System.out.println(names[counter]);
			}
		}*/
		
		
		
		final int numNames= 20;
		String [] names = new String [numNames];
		
		for (int counter = 0; counter < names.length; counter++)
		{
			System.out.println("Give A Name: ");
			names [counter] = input.nextLine();
		}
		
		System.out.println("Length of desired name: ");
		int length = input.nextInt();
		int amount = 0;
		
		for (int counter = 0; counter < names.length; counter++)
		{
			int fullLength = names[counter].length();
			if (fullLength == length)
			{
				amount++;
			}
		}
		System.out.println("Number of friends with " + length + " letters: " + amount);
	}
}
