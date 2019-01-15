package inheritance;
import java.util.ArrayList;
public class WOWTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> cat = new ArrayList<Player> ();
		cat.add(new Mage(2));
		cat.add(new Mage(3));
		cat.add(new Mage(4));
		cat.add(new Rogue(2));
		cat.add(new Rogue(3));
		cat.add(new Rogue(4));
		
		for (int counter = 0; counter<cat.size(); counter++)
		{
			for(int counter2=0; counter2<14; counter2++)
			{
				cat.get(counter).move();
			}
		}
		for (int counter = 0; counter<cat.size(); counter++)
		{
			System.out.println(cat.get(counter).stats());
		}
	}

}
