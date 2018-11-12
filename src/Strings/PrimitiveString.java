package Strings;
import java.util.Scanner;
public class PrimitiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		/*int age = 0;
		System.out.println("What is your age?");
		age = input.nextInt();
		
		input.nextLine(); 			//clear the input buffer
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("Name: "+name );
		System.out.println("Age: "+age );*/
		
		
//charAt		
		/* System.out.println("Write a sentence");
		String sentence = input.nextLine();
		
		System.out.println("First Letter: " + sentence.charAt(0));
		System.out.println("Third Letter: " + sentence.charAt(2));
		System.out.println(sentence);*/
//contains		
		/*System.out.println("Write a sentence");
		String sentence = input.nextLine();
		if (sentence.contains("Bob") == false)
		{
			System.out.println("This sentence does not have the word Bob");
		}
		else
		{
			System.out.println("This sentence does have the word Bob");
		}
		System.out.println(sentence);*/
		
		System.out.println("Write a name");
		String name1 = input.nextLine();
		System.out.println("Write another name");
		String name2 = input.nextLine();
		if (name1.compareTo(name2) == 0)
		{
			System.out.println("The names are the same");
		}
		if (name1.compareTo(name2) < 0)
		{
			System.out.println(name1 + " comes before " + name2);
		}
		if (name1.compareTo(name2) > 0)
		{
			System.out.println(name2 + " comes before " + name1);
		}
	}

}
