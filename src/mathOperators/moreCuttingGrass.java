package mathOperators;
import java.util.Scanner;
public class moreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width = 999;
		double length = 999;
		double widthdeck = 999;
		double speed =999;
		double numfeet =999;
		double numstrips = 999;
		double nummiles = 999.99;
		double time = 999.99;
		double money  =999.99;
	
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the yard in feet?");
		length = input.nextDouble();

		System.out.println("What is the width of the yard in feet?");
		width = input.nextDouble();
		
		System.out.println("What is the width of the mower deck in feet?");
		widthdeck = input.nextDouble();
		
		System.out.println("What is the speed of the mower?");
		speed = input.nextDouble();
		
		numstrips = width/widthdeck;
		numfeet = numstrips * length;  
		nummiles = numfeet/5280; 			// nummiles is a double
		time = (nummiles/speed);
		
		money = time*12;
		money = Math.round(money*100);
		money = money/100;
		
		System.out.println("It will take " + time + " hours" + "and you owe $" + money);

	}

}
