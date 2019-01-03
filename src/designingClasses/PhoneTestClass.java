package designingClasses;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class PhoneTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Phone> cat = new ArrayList<Phone>();
		Random bob = new Random();
		Scanner input = new Scanner (System.in);
		int min=0;
		int max = 10;
		
		for (int counter =0; counter<3; counter++)
		{
			System.out.println("Number: ");
			int number = input.nextInt();
			
			System.out.println("Minutes Used: ");
			int minutes = input.nextInt();
			
			cat.add(new Phone(number, minutes));
		}
		
		for (int counter2 =0; counter2<cat.size(); counter2++)
		{
			for (int counter3 = 0; counter3 <=300; counter3++)
			{
				int length = min + bob.nextInt(max-min+1);
				cat.get(counter2).makeCall(length);
			}
		}
		
		
		System.out.println(cat.get(cat.size()-1).clone().toString());
		
	}

}
