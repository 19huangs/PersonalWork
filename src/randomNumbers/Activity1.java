package randomNumbers;
import java.util.Random;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int min=1;
		int max=2;
		int heads =0;
		int tails = 0;
		int randomNum=0;
		Random aafreen = new Random();
		for (counter=1; counter<=100000; counter++)
		{
			randomNum = min + aafreen.nextInt(max-min+1);
			if (randomNum ==2)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		System.out.println("Number of tails: " + tails);
		System.out.println("Number of heads: " + heads);
	}

}
