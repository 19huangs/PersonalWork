package mathOperators;
import java.util.Scanner;
public class YearsUntilVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
int voteage = -999;
Scanner input = new Scanner (System.in);

System.out.println("How old are you?");
age = input.nextInt();
voteage = 18-age;
System.out.println(voteage + " years more until you can vote.");
	}

}
