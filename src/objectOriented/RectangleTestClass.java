package objectOriented;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle aafreen = new Rectangle();
		System.out.println(aafreen.returnLength());
		aafreen.changeLength(7.5);
		System.out.println(aafreen.returnLength());
		
		System.out.println(aafreen.returnWidth());
		aafreen.changeWidth(7.5);
		System.out.println(aafreen.returnWidth());
	}

}
