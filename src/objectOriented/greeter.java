package objectOriented;

//import statements at the top
public class greeter {

	// instance fields - data storage
	private int age;
	// constructors - methods for constructing the object

	// default constructor

	public greeter() {
		age = -999;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int xAge) {
		age = xAge;
		
	}

	public void sayHello() {
		System.out.println("Hello");
		// Statements to initialize the state of the object
	}
}
