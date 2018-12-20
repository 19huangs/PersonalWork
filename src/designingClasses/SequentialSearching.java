package designingClasses;
import java.util.Scanner;
import java.util.Random;

public class SequentialSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random (1);
		
		int []cat = new int[100];
		int min =1;
		int max = 10000;
		
		System.out.println("Number: ");
		int num = input.nextInt();
	do{ 	
		for (int counter=0; counter<100; counter++)
		{
			cat [counter]= min + bob.nextInt(max-min+1);
		}
		int times = 0;
		for (int counter2=0; counter2<100; counter2++)
		{
			if(cat[counter2]==num)
			{
				times++;
			}
			
		}
		if (times>0)
		{
			System.out.println("Number is in the array");
		}
		else 
		{
			System.out.println("Number is not in the array");
		}
	
	System.out.println("Number: (999 to quit)");
	num = input.nextInt();
	}
	while(num!=999);
	}
}
