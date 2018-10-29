package decisions;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number = 0;
		System.out.println("Number:");
		number = input.nextInt();
		while (number!=-1)
		{
			System.out.println(number*number*number);
			System.out.println("Number:");
			number = input.nextInt();
			
		}
	}

}
