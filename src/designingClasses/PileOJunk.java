package designingClasses;
import java.util.Random;
public class PileOJunk {
	private static int idNumber;
	private int randomNum;
	
	public PileOJunk()
	{
		Random bob = new Random ();
		int min=10;
		int max =100;
		int randomNum = min + bob.nextInt(max-min+1);
	}
	
	public static int randomSum(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	
	public void overwriteRandom(int randomNum)
	{
		randomNum = randomNum;
	}
}
