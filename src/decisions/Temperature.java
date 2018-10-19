package decisions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
	//SALARY ACTIVITY
		/* System.out.println("How much do money do you make a year?");
		float money = input.nextFloat();
		if (money<20000)
		{
			System.out.println("Worker");
		}
		else
		{
			if (money>=20000 && money<=40000)
			{
				System.out.println("Management");
			}
			else
			{ 
				if (money>40000 && money<=100000)
				{
					System.out.println("CEO");
				}
				else
				{
					if (money>100000)
					{
						System.out.println("Owner");
					}
				}
			}
		}
		
	} */
		
	// TEMPERATURE ACTIVITY
		System.out.println("What is the temperature?");
		int temperature = input.nextInt();
		if (temperature > 83) {
			System.out.println("Swimming Temp.");
		}
		else {
			if (temperature > 74) {
				System.out.println("Tennis Temp.");
			} 
			else 
			{
				if (temperature > 35) {
					System.out.println("Golf Temp.");
				} 
				else 
				{
					if (temperature > -10) {
						System.out.println("Snow Shoeing Temp.");
					} 
					else 
					{
						System.out.println("Nothing Temp.");
					}
				}
			}
		}
	}
}
				
			
			
		

	
