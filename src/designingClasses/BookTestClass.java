package designingClasses;
import java.util.Scanner;
import java.util.ArrayList;
public class BookTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		ArrayList <Book> cat = new ArrayList <Book> ();
		
		System.out.println("How many books do you have?");
		int books = input.nextInt();
		input.nextLine();
		for (int counter = 0; counter<books; counter++)
		{
			System.out.println("Name: ");
			String name = input.nextLine();
		
			System.out.println("Number of pages: ");
			int pages = input.nextInt();
			input.nextLine();
			cat.add(new Book (name, pages));
		}

		System.out.println("Pick a Name: ");
		String name2 = input.nextLine();
	
		System.out.println("Pick a Number of pages: ");
		int pages2 = input.nextInt();
		
		int samePages = 0;
		int sameNumTitle = 0;
		boolean inArray = false;
		for (int counter2 = 0; counter2<books; counter2++)
		{
			if(cat.get(counter2).getPages() == pages2)
			{
				samePages++;
			}
			
			if(cat.get(counter2).getTitle().length()==name2.length())
			{
				sameNumTitle++;
			}
			
			if(cat.get(counter2).getTitle().equals(name2))
			{
				inArray = true;
			}
		}
		
		System.out.println("Number of books with same number of pages: " +samePages);
		System.out.println("Number of books with same length of title: " +sameNumTitle);
		if (inArray=true)
		{
			System.out.println("The book is in the array");
		}
		else
		{
			System.out.println("The book is not in the array");
		}
	}
}
