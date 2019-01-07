package interfacesPolymorphism;
import java.util.Scanner;
import java.util. ArrayList;
public class ActivityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		/*System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("Width: ");
		int width = input.nextInt();
		
		Shape bob = new Rectangle (length, width);
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		
		System.out.println("Radius: ");
		int radius = input.nextInt();
		Shape bobb = new Circle (radius);
		
		System.out.println("Perimeter: " + bobb.perimeter());
		System.out.println("Area: " + bobb.area());
		}*/
		
		/*System.out.println("Length: ");
		int length = input.nextInt();
		System.out.println("Width: ");
		int width = input.nextInt();
		
		Rectangle bob = new Rectangle (length, width);
		Shape bobb = new Rectangle (length, width);
		
		
		bob.setLength(20);
		bob.setWidth(10);
		System.out.println(bob.area());
		System.out.println(bobb.area());*/
		
// Activity	
		
		/*Rectangle bob = new Rectangle (1,1);
		Rectangle bob1 = new Rectangle (2,2);
		Rectangle bob2 = new Rectangle (3,3);
		Rectangle bob3 = new Rectangle (4,4);
		Circle aafreen = new Circle (1);
		Circle aafreen1 = new Circle (2);
		Circle aafreen2 = new Circle (3);
		Circle aafreen3 = new Circle (4);
		
		ArrayList <Shape> cat = new ArrayList <Shape>();
		cat.add (bob);
		cat.add (bob1);
		cat.add (bob2);
		cat.add (bob3);
		cat.add (aafreen);
		cat.add (aafreen1);
		cat.add (aafreen2);
		cat.add (aafreen3);
		
		double total =0;
		double smallest = 10000;
		for (int counter = 0; counter <cat.size(); counter++)
		{
			total +=cat.get(counter).area();
			if (cat.get(counter).perimeter() < smallest)
			{
				smallest = cat.get(counter).perimeter();
			}
		}
		
		System.out.println("Sum of areas: " + total);
		System.out.println("Smallest Perimeter: " + smallest);
	}*/
		/*ArrayList <Person> cat = new ArrayList <Person>();
		
		Student bob = new Student ();
		Student bob1 = new Student ();
		Teacher aafreen = new Teacher ();
		Teacher aafreen1 = new Teacher ();
		bob.setName("Daisy");
		bob1.setName("Aafreen");
		aafreen.setName("Mr. O");
		aafreen1.setName("Mrs. K");
		
		cat.add (bob);
		cat.add (bob1);
		cat.add (aafreen);
		cat.add (aafreen1);
		
		for (int counter = 0; counter <cat.size(); counter++)
		{
			System.out.println(cat.get(counter).getName());
			if (cat.get(counter).getName().length() >10)
			{
				System.out.println(cat.get(counter).getAge() + " years old");
			}
		}
	}*/
		
		ArrayList <Person> cat = new ArrayList <Person>();
		
		Student bob = new Student ();
		Student bob1 = new Student ();
		Teacher aafreen = new Teacher ();
		Teacher aafreen1 = new Teacher ();
		bob.setName("Daisy");
		bob1.setName("Aafreen");
		aafreen.setName("Mr. O");
		aafreen1.setName("Mrs. K");
		
		cat.add (bob);
		cat.add (bob1);
		cat.add (aafreen);
		cat.add (aafreen1);
		
		for (int counter = 0; counter <cat.size(); counter++)
		{
			if (cat.get(counter) instanceof Student)
			{
				Student bobb = (Student) cat.get(counter);
				bobb.outSick();
			}
			System.out.println(cat.get(counter).getName());
		}
		
	}
}
