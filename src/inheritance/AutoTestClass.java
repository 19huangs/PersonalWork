package inheritance;
import java.util.ArrayList;
import java.util.Random;
public class AutoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bob = new Random ();
		ArrayList <Auto> cat = new ArrayList <Auto> ();
		
		cat.add(new Truck (true));
		cat.add(new Truck (false));
		cat.add(new Truck (true));
		cat.add(new Car (5));
		cat.add(new Car (2));
		cat.add(new Car (7));
		
		int max = 100;
		int min = 0;
		double total = 0;
		double total3=0;
		for (int counter = 0; counter <cat.size(); counter++)
		{
			int randomNum = min + bob.nextInt(max-min+1);
			cat.get(counter).drive(randomNum);
			System.out.println(randomNum);
			
		}
		for (int counter = 0; counter <cat.size(); counter++)
		{
			total += cat.get(counter).getOdometer();
			total3 += cat.get(counter).getMPG();
		}
		System.out.println(total);
		System.out.println("Average MPG: " + (total3/cat.size()));
		
		int total1 = 0;
		for (int counter = 0; counter <cat.size(); counter++)
		{
			if (cat.get(counter) instanceof Car)
			{
				Car tempCar = (Car) cat.get(counter);
				total1 += tempCar.getCupHolders();
			}
		}
		System.out.println("Total Cupholders: " + total1);
		
		int times = 0;
		for (int counter = 0; counter <cat.size(); counter++)
		{
			if (cat.get(counter) instanceof Truck)
			{
				Truck tempTruck = (Truck) cat.get(counter);
				if (tempTruck.getFourWD()==true)
				{
					times++;
				}
			}
		}
		System.out.println("Number of Trucks that are four wheel: " + times);
	}
}
