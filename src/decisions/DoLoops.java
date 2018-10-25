package decisions;
import java.util.Scanner;
public class DoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		/*System.out.println("Enter Number: ");
		int num = input.nextInt();
		do 
		{	System.out.println("Product: " + (num*17));
			System.out.println("Enter Number: ");
			 num = input.nextInt();
			
		}
			while (num!=9999);*/
		int largest = 0;
		int smallest = 9998;
		
		System.out.println("Enter Number: ");
		int num = input.nextInt();
		do
		{
			
			if (num >largest)
			{ 
				largest = num;
			}
			if (num <smallest)
			{
				smallest = num;
			}
			System.out.println("Enter Number: ");
			num = input.nextInt();
		}
		while (num!=9999);
		int difference = largest - smallest;
		System.out.println("Difference: " + difference);
		}
	
	}


