package Strings;
import java.util.Scanner;
public class BestFriendTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		BestFriend aafreen = new BestFriend();
		
		System.out.println("Name of new best friend: ");
		String newBestFriend = input.nextLine();
		
		System.out.println("Rank of new best friend: ");
		int newRank = input.nextInt();
		
		System.out.println("Was the change successful?");
		System.out.println(aafreen.changeFriend(newBestFriend, newRank));
		
		String firstfriend1 = aafreen.getFriend1();
		System.out.println(firstfriend1.charAt(0));
		
		System.out.println("Length of Best Friend #3 name: " + aafreen.getLastLength3());
	}

}
