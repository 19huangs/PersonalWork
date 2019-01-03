package designingClasses;

public class RecursionClassActivities {

	public static void main(String[] args) {
		System.out.println(sumOfNumbers(4));
	}
		public static int sumOfNumbers(int num)
		{
			int sum=0;
			if (num >0)
			{
				return num +sumOfNumbers(num-1);
				
			}
			return 0;
		}
}

