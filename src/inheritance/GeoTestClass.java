package inheritance;
import java.util.ArrayList;
public class GeoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Geo> cat = new ArrayList <Geo>();
		cat.add(new Rectangle(5,6));
		cat.add(new Rectangle(1,2));
		cat.add(new Trapezoid(1,2,3));
		cat.add(new Trapezoid(2,3,4));
		
		double largest =0;
		int num =0;
		for (int counter = 0; counter<cat.size(); counter++)
		{
			if (largest<cat.get(counter).area())
			{
				largest = cat.get(counter).area();
				num = counter;
			}
		}
		
			if (cat.get(num) instanceof Rectangle)
			{
				System.out.println("Rectangle");
			}
			else
			{
				System.out.println("Trapezoid");
			}
				
		
		System.out.println("Largest Area: "+largest);
		
	}

}
