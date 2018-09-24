package mathOperators;
import java.util.Scanner;
public class speedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speedlimit = 999;
		int driverspeed = 999;
		int cost = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the speed limit?");
		speedlimit = input.nextInt();
		System.out.println("What is the speed of the driver?");
		driverspeed = input.nextInt();
		cost = ((driverspeed-speedlimit- 1) * 40) + 55;
		System.out.println("Fine: " + cost);
	}

}
