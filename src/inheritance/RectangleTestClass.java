package inheritance;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle (10,20);
		System.out.println(bob.getPerimeter());
		System.out.println(bob.area());
		
		Quadrilateral cat = new Quadrilateral();
		System.out.println(cat.toString());
	
	}

}
