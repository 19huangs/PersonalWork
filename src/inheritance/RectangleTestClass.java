package inheritance;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle (10,20);
		Rectangle bobb = new Rectangle (5,6);
		
		Trapezoid cat = new Trapezoid(5,6,7);
		Trapezoid catt = new Trapezoid(2,3,4);
		
		System.out.println(bob.toString());
		System.out.println(bobb.toString());
		System.out.println(bob.equals(bobb));
	
	}

}
