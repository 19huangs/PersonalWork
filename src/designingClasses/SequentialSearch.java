package designingClasses;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random(10);
		
		/*ArrayList <Integer> cat = new ArrayList<Integer> ();
		boolean inThere = false;
		int min = 1;
		int max = 1600;
		for (int counter = 0; counter<=1000; counter++)
		{
			cat.add(min + bob.nextInt(max-min+1));
		}
		
		System.out.println("Number: ");
		int num = input.nextInt();
		
		for (int counter = 0; counter<=1000; counter++)
		{
			if (cat.get(counter) == num)
			{
				inThere = true;
			}
		}
		
		System.out.println(inThere);
	}*/
		
		/*int [] cat = new int [100];
		int min = 0;
		int max = 499;
		for (int counter = 0; counter<100; counter++)
		{
			cat[counter] = min + bob.nextInt(max-min+1);
		}	
		
		System.out.println("Number: ");
		int num = input.nextInt();
		int times = 0;
		for (int counter2 = 0; counter2<100; counter2++)
		{
			if (cat[counter2] == num)
			{
				times ++;
			}
		}
		
		System.out.println(times);
	}*/
		
		ArrayList <RectangleClass> cat = new ArrayList<RectangleClass> ();
		int min = 0;
		int max = 499;
		
		int randomNum =0;
		int randomNum2 =0;
		for (int counter = 0; counter<=100; counter++)
		{
			randomNum = min + bob.nextInt(max - min +1);
			randomNum2 = min + bob.nextInt(max - min +1);
			cat.add(new RectangleClass(randomNum, randomNum2));
		}
		
		int times = 0;
		for (int counter2 = 0; counter2<=100; counter2++)
		{
			if (cat.get(counter2).getWidth() == 10)
			{
					times ++;
			}
		}
		
		System.out.println(times);
	}
}
