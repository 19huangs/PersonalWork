package arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class ArrayListActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		/*ArrayList<String> cat = new ArrayList<String>();
		cat.add("Bob Smith");
		cat.add("Jane Miller");
		cat.add(1,"Billy Jones");
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		cat.add(name);
		
		for (int counter= 0; counter <cat.size(); counter++)
		{
			System.out.println(cat.get(counter));
		}	
	}*/
// Friend Activity
		/*ArrayList<FriendClass> cat = new ArrayList<FriendClass>();

		cat.add(new FriendClass("First Friend", 17));
		cat.add(0, new FriendClass("Second Friend", 15));
		cat.add(0, new FriendClass("Third Friend", 12));
		for (int counter= 0; counter <cat.size(); counter++)
		{
			System.out.println(cat.get(counter).getAge());
			
		}	
	}*/
		
	/*	int randomNum =0;
		int randomNum2 =0;
		int min =50;
		int max =70;
		Random bob = new Random(1);
		ArrayList<RectangleClass> cat = new ArrayList<RectangleClass>();

		for (int counter= 0; counter <400; counter++)
		{
			randomNum = min +bob.nextInt(max-min+1);
			randomNum2 = min + bob.nextInt(max-min+1);
			cat.add(new RectangleClass(randomNum, randomNum2));
		}
		
		for (int counter2= cat.size()-1; counter2 >=0 ; counter2--)
		{
			System.out.println(cat.get(counter2).area());
		}
	}	*/
		
		/*ArrayList<String> cat = new ArrayList<String>();
		
		System.out.println("Number of friends: ");
		int friends = input.nextInt();
		for (int counter = 0; counter<friends; counter++)
			{
				System.out.println("Name: ");
				String name = input.nextLine();
				cat.add(name);
			}
		
			cat.remove(0);
			cat.remove(3);  //Remember that index changes when you take one out
			
			System.out.println(cat);
	}*/
		
		/*int randomNum =0;
		int randomNum2 =0;
		int min =50;
		int max =70;
		Random bob = new Random(1);
		ArrayList<RectangleClass> cat = new ArrayList<RectangleClass>();

		for (int counter= 0; counter <400; counter++)
		{
			randomNum = min +bob.nextInt(max-min+1);
			randomNum2 = min + bob.nextInt(max-min+1);
			cat.add(new RectangleClass(randomNum, randomNum2));
		}
		int min2 =0;
		int max2 =399;
		int randomNum3= min2 +bob.nextInt(max2-min2+1);
		cat.remove(randomNum3);
		
		RectangleClass trash = cat.remove(randomNum3);
		System.out.println("Removed area: " + trash.area());
		
		for (int counter2= cat.size()-1; counter2 >=0 ; counter2--)
		{
			System.out.println(cat.get(counter2).area());
		}
	}*/
		
		ArrayList<RectangleClass> cat = new ArrayList<RectangleClass>();
		
		
		for (int counter= 0; counter <10; counter++)
		{
			System.out.println("length: ");
			int length = input.nextInt();
			
			System.out.println("width: ");
			int width = input.nextInt();
			
			cat.add(new RectangleClass(length, width));
		}
		
		RectangleClass trash = cat.remove(cat.size()-1);
		cat.set(0, trash);
		
		for (int counter2= 0; counter2 <9; counter2++)
		{
			System.out.println("Length: " + cat.get(counter2).getLength() + " Width: " + cat.get(counter2).getWidth());
		}
	}
}






