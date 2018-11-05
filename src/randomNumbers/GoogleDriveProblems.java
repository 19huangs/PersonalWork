package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class GoogleDriveProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aafreen = new Random ();
		Scanner input = new Scanner (System.in);
		
		
//ROLL A DIE	
		/* int sides = 0;
		int rolls =0;
		System.out.println("How many sides on the dice are there?");
		sides = input.nextInt();
		System.out.println("How many rolls?");
		rolls = input.nextInt();
		
		int counter =0;
		int min=1;
		int max =sides;
		int randomNum = 0;
		
		for (counter =1; counter <=rolls; counter++)
		{
			randomNum = min + aafreen.nextInt(max-min+1);
			System.out.println("You rolled a " + randomNum);
		}
	}*/
		
//ROLL A DIE 2
		double rolls =0;
		System.out.println("How many rolls?");
		rolls = input.nextInt();
		
		int counter =0;
		int min=1;
		int max =6;
		int randomNum = 0;
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		double five = 0;
		double six = 0;
		
		for (counter =1; counter <=rolls; counter++)
		{
			randomNum = min + aafreen.nextInt(max-min+1);
			if (randomNum == 1)
			{
				one ++;
			}
			if (randomNum == 2)
			{
				two ++;
			}
			if (randomNum == 3)
			{
				three ++;
			}
			if (randomNum == 4)
			{
				four ++;
			}
			if (randomNum == 5)
			{
				five ++;
			}
			if (randomNum == 6)
			{
				six ++;
			}
		}
		
		System.out.println("Rolled a one percentage: " + ((one/rolls) *100));
		System.out.println("Rolled a two percentage: " + ((two/rolls) *100));
		System.out.println("Rolled a three percentage: " + ((three/rolls) *100));
		System.out.println("Rolled a four percentage: " + ((four/rolls) *100));
		System.out.println("Rolled a five percentage: " + ((five/rolls) *100));
		System.out.println("Rolled a six percentage: " + ((six/rolls) *100));
	}	
}
