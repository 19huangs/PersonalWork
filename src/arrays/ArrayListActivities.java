package arrays;
import java.util.ArrayList;
import java.util.Scanner;
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
		ArrayList<FriendClass> cat = new ArrayList<FriendClass>();

		cat.add(new FriendClass("First Friend", 17));
		cat.add(0, new FriendClass("Second Friend", 15));
		cat.add(0, new FriendClass("Third Friend", 12));
		for (int counter= 0; counter <cat.size(); counter++)
		{
			System.out.println(cat.get(counter).getAge());
			
		}	
	}
}