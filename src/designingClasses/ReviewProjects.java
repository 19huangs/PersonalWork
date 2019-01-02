package designingClasses;
import java.util.Scanner;
import java.util.Random;
public class ReviewProjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random bob = new Random (1);
		Random bobb = new Random (1);
		
	// Playground research
		/*int rows = 10;
		int columns = 12;
		int [] [] cat = new int [rows][columns];
		
		int tallest =0;
		int shortest =10000000;
		for (int counter= 0; counter <10; counter ++)
		{
			for (int counter2= 0; counter2 <12; counter2 ++)
			{
				System.out.println("Height: ");
				int height = input.nextInt();
				cat[counter][counter2] = height;
				if (cat[counter][counter2] >tallest)
				{
					tallest = cat[counter][counter2];
				}
				
				if (cat[counter][counter2] <shortest)
				{
					shortest = cat[counter][counter2];
				}
			}
		}
		double total =0;
		for (int counter= 0; counter <10; counter ++)
		{
			for (int counter2= 0; counter2 <12; counter2 ++)
			{
				total += cat[counter][counter2];
			}
		}
		double average = total/120;
		System.out.println("Overall Average Height: " + average);
		System.out.println("Tallest Student: " + tallest);
		System.out.println("Shortest Student: " + shortest);
	}
}*/
		
//Detention Supervisor
		/*int rows =5;
		int columns = 7;
		Student [] [] cat = new Student [rows][columns];
		String name = "";
		int grade = 0;
		for (int counter= 0; counter <rows; counter ++)
		{
			for (int counter2= 0; counter2 <columns; counter2 ++)
			{
				System.out.println("Name: ");
				name = input.nextLine();
				
				System.out.println("Grade: ");
				grade = input.nextInt();
				input.nextLine();
				
				cat [counter][counter2] = new Student(name,grade);
			}
		}
		double totalLength=0;
		int timesNinth =0;
		double timesTwelfth =0;
		for (int counter= 0; counter <rows; counter ++)
		{
			for (int counter2= 0; counter2 <columns; counter2 ++)
			{
				totalLength += cat [counter][counter2].getName().length();
				
				if ( cat [counter][counter2].getGrade() == 9)
				{
					timesNinth ++;
				}
				if ( cat [counter][counter2].getGrade() == 12)
				{
					timesTwelfth ++;
				}
			}
		}
		
		System.out.println("Average Length of student names: " + totalLength/(rows*columns));
		System.out.println("Number of 9th graders: " + timesNinth);
		System.out.println("Percentage of 12th graders: " + ((timesTwelfth/(rows*columns)) * 100) + "%");
	}
}*/
// Post Review Part 1
		/*int nums = 487;
		int [] cat = new int [nums];
		
		int min = 1;
		int max = 6;
		double times = 0;
		for (int counter= 0; counter <nums; counter ++)
		{
				cat [counter] = min + bob.nextInt(max-min +1);
				if (cat[counter]%2 !=0)
				{
					times ++;
				}
		}
		for (int counter2=nums-1; counter2 >=0; counter2 --)
		{
				System.out.println(cat [counter2]);
		}
		System.out.println("Percentage of rolls that were odd: " + ((times/nums) *100) + "%");
	}
}*/
// Post Review Part 2	
		/*int nums = 3;
		String [] cat = new String [nums];
	
		for (int counter= 0; counter <nums; counter ++)
		{
				System.out.println("Name: ");
				cat [counter] = input.nextLine();
		}
		
		for (int counter2=nums-1; counter2 >=0; counter2 --)
		{
				System.out.print(cat [counter2].charAt(0));  
				System.out.println(cat [counter2].charAt(cat [counter2].indexOf(" ") +1));
		}
	}*/
		
// Post Review Part 3
		System.out.println("How many horses?");
		int nums =input.nextInt();
		input.nextLine();
		RaceHorse [] cat = new RaceHorse [nums];
		RaceHorse [] caat = new RaceHorse [50];
		
		for (int counter= 0; counter <nums; counter ++)
		{
			System.out.println("Name: ");
			String name = input.nextLine();
			
			System.out.println("Total Races: ");
			int numRaces = input.nextInt();
			
			System.out.println("Total Miles: ");
			int numMiles = input.nextInt();
			input.nextLine();
			
			cat[counter] = new RaceHorse (name, numRaces, numMiles);
		}
		int min = 1;
		int max = nums;
		int min1 = 1;
		int max1 = 5;
		for (int counter2= 0; counter2 <50; counter2 ++)
		{
			int randomNum = min + bob.nextInt(max-min+1);
			caat [counter2] = cat[randomNum];
			caat [counter2].race(min1 + bobb.nextInt(max1-min1+1));
		}
		int greatest =0;
		for (int counter2= 0; counter2 <50; counter2 ++)
		{
			System.out.println(caat[counter2].getName());
			if (caat[counter2].getNumMiles() > greatest)
			{
				greatest = caat[counter2].getNumMiles();
			}
		}
		System.out.println("Greatest Distance raced by a horse: " + greatest);
	}
}	
		
		
		