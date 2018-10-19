package decisions;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What percentage did you get on your first test?");
		double test1 = input.nextDouble();
		
		System.out.println("What percentage did you get on your second test?");
		double test2 = input.nextDouble();
		
		System.out.println("What percentage did you get on your third test?");
		double test3 = input.nextDouble();
		
		double average = (test1+test2+test3) / 3.0;
		System.out.println("Average Percentage: " +average + "%");
		
		if (average>=92.5)
		{
			System.out.println("Letter Grade: A");
		}
		else
		{
			if (average<92.5 && average >=84.5)
			{
				System.out.println("Letter Grade: B");
			}
			else
			{
				if (average<84.5 && average >=77.5)
				{
					System.out.println("Letter Grade: C");
				}
				else
				{
					if (average<77.5 && average >=69.5)
					{
						System.out.println("Letter Grade: D");
					}
					else
					{
						System.out.println("Letter Grade: F");
					}
				}
			}

		}
	}
}
