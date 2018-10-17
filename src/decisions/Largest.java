package decisions;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is test score 1?");
		double score1 = input.nextDouble();
		System.out.println("What is test score 2?");
		double score2 = input.nextDouble();
		
		if(score1>score2)
		{
			System.out.println("Great Job");
		}
		
	}

}
