package mathOperators;
import java.util.Scanner;
public class practiceAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int numsongs= 999;
		int minutes = 999;
		int seconds = 999;
		int average = 999;
		int remainder = 999;
		
		System.out.println("How many songs are there?");
		numsongs = input.nextInt();
		
		System.out.println("How many minutes are there of all songs?");
		minutes = input.nextInt();
		
		System.out.println("How many seconds are remaining of all songs?");
		seconds = input.nextInt();
		
		seconds = (60*minutes) + seconds;
		average = (seconds/numsongs)/60;
		remainder = (seconds/numsongs)%60;
		
		System.out.println("The average song length is " + average + " minutes and " + remainder + " seconds");
		
		
		
	}

}
