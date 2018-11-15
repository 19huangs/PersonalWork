package Strings;
import java.util.Scanner;
public class EssayTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Essay aafreen = new Essay();
		System.out.println("Put in author's name:");
		String name = input.nextLine();
		
		System.out.println("Put in text:");
		String text = input.nextLine();
		
		aafreen.setAuthor(name);
		aafreen.setText(text);
		
		System.out.println(aafreen.getLastName());
		System.out.println(aafreen.getnumFirst());
		System.out.println(aafreen.letter());
		System.out.println(aafreen.getnumWords());
	}

}
