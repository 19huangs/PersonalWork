package randomNumbers;
import java.util.Random;
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aafreen = new Random ();
		/*int counter= 0;
		int min=1;
		int max =13;
		int randomNum = 0;
		int times = 0;
		for (counter =1; counter <=87; counter++)
		{
			randomNum = min + aafreen.nextInt(max-min+1);
			if (randomNum%3==0)
			{
				times ++;
			}
		}
		System.out.println("Number of times a multiple of 3 was rolled: " + times);
	}*/
		int counter= 0;
		int min=26;
		int max =43;
		int randomNum = 0;
		int times = 0;
		for (counter =1; counter <=248; counter++)
		{
			randomNum = min + aafreen.nextInt(max-min+1);
			if (randomNum>36)
			{
				times ++;
			}
		}
		System.out.println("Number first graders more than 3 feet: " + times);
	}
}
