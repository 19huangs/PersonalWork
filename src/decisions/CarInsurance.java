package decisions;
import java.util.Scanner;
public class CarInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double cost = 200.0;
		System.out.println("What is your age?");
		double age = input. nextDouble();
		System.out.println("What is your weight?");
		double weight = input. nextDouble();
		System.out.println("Do you smoke?");
		boolean smoke = input. nextBoolean();
		
		if (age>75.0)
		{
			cost += 125;
		}
		
		if (age< 30.0)
		{
			cost -= 25;
		}
		
		if (weight> 700.0)
		{
			cost += 300;
		}
		
		if (smoke== true)
		{
			cost += 50;
		}
			cost-=40;
			
		System.out.println("Cost: " + cost);	
	}

}
