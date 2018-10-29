package decisions;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int counter1 =0;
		int counter2 =0;
		 for (counter2=1; counter2<=4; counter2++)
		{
			for (counter1=1; counter1 <=5; counter1+=1)
			{
				System.out.print(counter1*counter2 + " ");
			}
				System.out.println();
		}
	}*/
		/*for (counter1 = 1; counter1<=4; counter1++)
		{
			for (counter2=1; counter2 <=5; counter2+=1)
			{
				if (counter2 != 3)
				{
					System.out.print(counter2 + " ");
				}
				else 
					{System.out.print(counter1 + " ");
					}
				
			}
			System.out.println();
		
		}
	}*/
		int numdivisors = 0;
		int counter2 =0;
		int number1 = 0;
		int number2 = 0;
		int greatest = 0;
		for (number1 = 1; number1<=1000; number1++)
		{
			for (number2=1; number2<=1000; number2++)
			{
				if (number1%number2==0)
				{
					numdivisors++;
					
					
				}
			}
			if (greatest < numdivisors)
			{ 
				greatest= numdivisors;
				numdivisors=0;
			}
			System.out.print(number1);
		}
}
}

