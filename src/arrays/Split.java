package arrays;
import java.util.Scanner;
import java.util.Random;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		/*System.out.println("Write a Sentence");
		String sentence = new String ();
		sentence = input.nextLine();
		
		String[] firstLetter = sentence.split(" ");
		
		for (int counter = 0; counter < firstLetter.length; counter++)
		{
			System.out.println(firstLetter[counter].charAt(0));
		}
	}*/
		/*System.out.println("Write a Sentence");
		String sentence = input.nextLine();
		
		System.out.println("Write a Key word");
		String keyWord = input.nextLine();
		
		
		
		String[] numKey = sentence.split(" ");
		int num = 0;
		for (int counter = 0; counter < numKey.length; counter++)
		{
			if (numKey[counter].equals(keyWord))
			{
				num ++;
			}
		}
		System.out.println(keyWord + " shows up " + num + " times");
	}*/
		Random bob = new Random();
		System.out.println("Write a Sentence");
		String sentence = input.nextLine();
	
		String[] random = sentence.split(" ");
		int min = 0; 
		int max = random.length-1; 
		int randomNum = 0;
		
		randomNum = min + bob.nextInt(max-min+1);
			
		System.out.println(random[randomNum]);
	}
}
