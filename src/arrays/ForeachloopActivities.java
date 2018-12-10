package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ForeachloopActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		/*ArrayList <Integer> cat = new ArrayList <Integer> ();
		
		System.out.println("Number of students in class: ");
		double num = input.nextInt();
	
		for(int counter = 0; counter <num; counter++)
		{
			System.out.println("Age: ");
			int age = input.nextInt();
			cat.add(age);
			
		}
		
		double total = 0;
		for (int counter2 : cat)
		{
			total += counter2;
		}
		
		System.out.println("Average Age: " +total/num);
	}*/
		/*ArrayList <Double> cat = new ArrayList <Double> ();
		
		System.out.println("Number of employees: ");
		double num = input.nextDouble();
	
		for(int counter = 0; counter <num; counter++)
		{
			System.out.println("Wage: ");
			double wage = input.nextDouble();
			cat.add(wage);
			
		}
		
		double largest = 0;
		for (double counter2 : cat)
		{
			if (counter2>largest)
			{
				largest = counter2;
			}
		}
		
		System.out.println("Largest Wage: " + largest);
	}*/
		
		ArrayList <CircleClass> cat = new ArrayList <CircleClass> ();
	
		for(int counter = 0; counter <10; counter++)
		{
			System.out.println("Radius: ");
			double radius = input.nextDouble();
			cat.add(new CircleClass(radius));
			
		}
		
		for (CircleClass counter2 : cat)
		{
			System.out.println(counter2.area());
		}
	}
}
