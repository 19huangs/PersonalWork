package mathOperators;
import java.util.Scanner;
public class bussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int group = 78;
		int buses = 999;
		int leftover = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("There are " + group + " people");

		buses = group/35;
		leftover = group%35;
		
		System.out.println("You will need " + buses + " buses");
		System.out.println("There will be " + leftover + " people left over");
		
		
		
	}

}
