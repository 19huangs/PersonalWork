package objectOriented;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle aafreen = new Rectangle();
		System.out.println("Box length: " + aafreen.returnLength());
		aafreen.changeLength(7.5);
		System.out.println("Box length: " + aafreen.returnLength());
		
		System.out.println("Box width: " +aafreen.returnWidth());
		aafreen.changeWidth(7.5);
		System.out.println("Box width: " +aafreen.returnWidth());
		
		System.out.println("Box perimeter: " + aafreen.Perimeter());
		System.out.println("Box area: " + aafreen.Area());

		
		aafreen = new Rectangle(3,8.75); 
		System.out.println("Box length: " + aafreen.returnLength());
		System.out.println("Box width: " +aafreen.returnWidth());
		System.out.println("Box perimeter: " + aafreen.Perimeter());
		System.out.println("Box area: " + aafreen.Area());
		aafreen.changeLength(7.5);
		aafreen.changeWidth(7.5);
		
		System.out.println("Box length: " + aafreen.returnLength());
		System.out.println("Box width: " +aafreen.returnWidth());
		

	}

}
